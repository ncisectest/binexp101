
class Test  implements Runnable{
    private int items = 3;

    public synchronized void removeItems() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (items > 0) {
            items--;
        }
        else{
            System.out.println("There are no more items");
        }
    }



    @Override
    public synchronized void run() {

        System.out.println("Number of items for thread  "
        + Thread.currentThread().getName() + " before removing items: " + items);
        this.removeItems();
        System.out.println("Number of items for thread "
        + Thread.currentThread().getName() + " after removing Items: " + items);
    }

}

public class CA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test testObject = new Test();
        Thread t1 = new Thread(testObject, "Thread-1");
        Thread t2 = new Thread(testObject, "Thread-2");
        Thread t3 = new Thread(testObject, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }

}
