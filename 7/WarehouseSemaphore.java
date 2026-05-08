import java.util.concurrent.Semaphore;

public class WarehouseSemaphore {
    private static final Semaphore loaders = new Semaphore(3);
    private static int currentWeight = 0;
    private static final int MAX_WEIGHT = 150;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        int[] items = {40, 50, 60, 30, 20, 80, 10, 40, 50, 20};

        for (int i = 0; i < items.length; i++) {
            final int weight = items[i];
            new Thread(() -> {
                try {
                    loaders.acquire();
                    synchronized (lock) {
                        if (currentWeight + weight > MAX_WEIGHT) {
                            System.out.println("Разгружается " + currentWeight + " кг");
                            Thread.sleep(500);
                            currentWeight = 0;
                        }
                        currentWeight += weight;
                        System.out.println("Добавленно " + weight + " кг. Текущий вес: " + currentWeight);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    loaders.release();
                }
            }).start();
        }
    }
}