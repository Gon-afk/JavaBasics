public class ThreadExample  extends Thread{
    private int counter = 0;
    public void run()
    {
        System.out.println(Thread.currentThread().getName() +" is running with the id: " + Thread.currentThread().threadId());
    }
    public synchronized void increment(){
        counter ++;
    }
    public static void main(String[] args) throws InterruptedException {

        ThreadExample t1 = new ThreadExample();
        t1.setName("DataBase Thread");
        t1.start();
        Thread t2 = new Thread(t1);
        Thread t3 = new Thread(t1);
        t2.start();
        t3.join();
        //System.out.println("_________________________________________");
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            ThreadExample object
                    = new ThreadExample();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            object.start();
        }
        System.out.println("_________________________________________");
        ThreadExample ThreadExample = new ThreadExample();
        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                ThreadExample.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                ThreadExample.increment();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter: " + ThreadExample.counter);
    }

}

