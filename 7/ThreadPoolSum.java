import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolSum {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        int chunkSize = array.length / numThreads;
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;

            futures.add(executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) sum += array[j];
                return sum;
            }));
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) totalSum += future.get();

        System.out.println("Итоговая сумма: " + totalSum);
        executor.shutdown();
    }
}