class MyThreadRunnable1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am thread runnable1; please be comfortable with me");
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am thread runnable2; be friendly with me, I'm your friend");
        }
    }
}

public class ThreadUsingInterface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start(); // Start the first thread
        gun2.start(); // Start the second thread
    }
}
