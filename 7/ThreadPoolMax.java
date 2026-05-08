import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolMax {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[][] matrix = {{12, 45, 7}, {89, 23, 56}, {34, 101, 22}, {15, 67, 9}};
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int[] row : matrix) {
            futures.add(executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int val : row) if (val > max) max = val;
                return max;
            }));
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            int localMax = future.get();
            if (localMax > globalMax) globalMax = localMax;
        }

        System.out.println("Наибольший элемент: " + globalMax);
        executor.shutdown();
    }
}