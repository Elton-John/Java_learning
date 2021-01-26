package java_29_treads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = new Thread(new Runner());
        firstThread.start();
        firstThread.sleep(2000);

        Thread secondThread = new Thread(new Runner());
        secondThread.start();
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from " + Thread.currentThread().getName() + " " + i);
        }
    }
}
