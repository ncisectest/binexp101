class SynchQueue {
    private int front = 0, back = 0;
    private int noItems = 0;
    private int[] tabItems;
    private int maxnoItems;

    public SynchQueue(int maxsize) {
        maxnoItems = maxsize;
        tabItems = new int[maxnoItems];
    }

    public int queueSize() { return noItems; }

    public synchronized void insert(int item) {
        while (noItems == maxnoItems) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        };

        tabItems[back] = item;
        back = (back + 1) % maxnoItems;
        noItems += 1;
        notifyAll();
    }

    public synchronized int remove() {
        int item;
        while (noItems == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        };

        item = tabItems[front];
        front = (front + 1) % maxnoItems;
        noItems -= 1;
        notifyAll();

        return item;
    }
}

class Producer extends Thread {
    private SynchQueue synQue;
    private int minItem, maxItem;
    public Producer(SynchQueue que, int min, int no) {
        synQue = que;
        minItem = min;
        maxItem = min + no;
    }

    public void run() {
        for (int item = minItem; item <= maxItem; item += 1) {
            System.out.println("Producer:" + this + " value:" + item);
            synQue.insert(item);
        }
    }
}

class Consumer extends Thread {
    private SynchQueue synQue;
    public Consumer(SynchQueue que) { synQue = que; }

    public void run() {
        int item;
        do {
            item = synQue.remove();
            System.out.println("Consumer:" + this + " value:" + item);
        } while (item != -1);
    }
}

public class MultiProdCons {
    public static void main(String[] args) {
        int noCons = 3, noProds = 4;

        SynchQueue sque = new SynchQueue(5);
        Consumer[] cons = new Consumer[noCons];
        Producer[] prods = new Producer[noProds];

        for (int i = 0; i < noCons; i += 1) {
            cons[i] = new Consumer(sque);
            cons[i].start();
        }
        for (int i = 0; i < noProds; i += 1) {
            prods[i] = new Producer(sque, i * 100, 50);
            prods[i].start();
        }
        for (int i = 0; i < noProds; i += 1) {
            try {
                prods[i].join();
            } catch (InterruptedException ex) {
            };
        }
        for (int i = 0; i < noCons; i += 1) {
            sque.insert(-1);
        }
        for (int i = 0; i < noCons; i += 1) {
            try {
                cons[i].join();
            } catch (InterruptedException ex) {
            };
        }

        System.out.println("successful completion");
    }

}
