package Thread;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Lab1 {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}
