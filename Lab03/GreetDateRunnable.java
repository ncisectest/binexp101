import java.util.Date;
import java.lang.Math;

class DateRunnable implements Runnable {
    private Date date;
    private static final int TIMES = 10;
    public DateRunnable(Date aDate) { date = aDate; }

    public void run() {
        for (int i = 0; i < DateRunnable.TIMES; i++) {
            try {
                Date nowDate = new Date();
                System.out.println("started:" + date + " now:" + nowDate);
                int pause = (int) (Math.random() * 3000);
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

class GreetRunnable implements Runnable {
    private String greeting;
    private static final int TIMES = 10;
    public GreetRunnable(String aGreeting) { greeting = aGreeting; }

    public void run() {
        for (int i = 0; i < GreetRunnable.TIMES; i++) {
            try {
                System.out.println(greeting);
                int pause = (int) (Math.random() * 3000);
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }
}

public class GreetDateRunnable {
    public GreetDateRunnable() { }

    public static void main(String[] args) {
        /* TODO code application logic here */
        /* create runnable objects */
        GreetRunnable gr = new GreetRunnable("Hello!");
        DateRunnable dr = new DateRunnable (new Date());
        /* create thread objects */
        Thread gt = new Thread(gr);
        Thread dt = new Thread(dr);
        /* start threads */
        gt.start();
        dt.start();
    }
}
