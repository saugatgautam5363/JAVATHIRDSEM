class UsingInterface implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000); // 1-second delay
                System.out.println(Thread.currentThread().getName() + " - Processing email user " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

class UserClassThread implements Runnable {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100); // Simulates processing delay
                System.out.println(Thread.currentThread().getName() + " - User registration in progress: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class Theread {
    public static void main(String[] args) {
        UsingInterface emailTask = new UsingInterface();
        UserClassThread userTask = new UserClassThread();

        Thread emailThread = new Thread(emailTask, "Email-Thread");
        Thread userThread = new Thread(userTask, "User-Thread");

        emailThread.start();
        userThread.start();
    }
}
