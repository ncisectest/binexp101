class HelloThread extends Thread {
    public void run() {
        int pause;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Hello!");
                pause = (int) (Math.random() * 3000);
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class CountThread extends Thread {
    int pause;

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i);
                pause = (int) (Math.random() * 3000);
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

public class HelloCountThread {
    public HelloCountThread() { }

    public static void main(String[] args) {
        /* TODO code application logic here */
        HelloThread hello = new HelloThread();
        CountThread count = new CountThread();

        hello.start();
        count.start();
    }
}
