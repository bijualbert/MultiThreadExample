public class MultiThreadExample extends Thread {
    private int threadNumber;

    public MultiThreadExample(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadNumber + " finished.");
    }

    public static void main(String[] args) {
        MultiThreadExample thread1 = new MultiThreadExample(1);
        MultiThreadExample thread2 = new MultiThreadExample(2);
        MultiThreadExample thread3 = new MultiThreadExample(3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
