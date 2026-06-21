public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread2(), "Thread-1");
        Thread t2 = new Thread(new MyThread2(), "Thread-2");
        // set priority
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        t1.start();
        t2.start();

    }
}
class  MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Thread is running : " + Thread.currentThread().getName());
        }
    }
}
