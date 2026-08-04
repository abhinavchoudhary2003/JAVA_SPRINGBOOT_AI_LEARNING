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
/*
"Priority doesn't control Thread  execution — it's just a hint to the scheduler. The Task scheduler still decides everything by own, but a higher-priority thread is more likely to get picked when multiple threads are ready to run. It's a suggestion, not a guarantee — so we shouldn't rely on it for correctness, only for rough performance tuning."
That one line covers the core idea. If they push further, you can add:

"Because it's JVM/OS-dependent" — different platforms honor priority differently, so it's not portable or reliable behavior.
"If it were a guarantee, low-priority threads could starve forever" — so schedulers deliberately don't obey it strictly.
"For actual ordering guarantees, we use synchronization — locks, join(), executors — not priority."
 */