package MutlthreadingDemo;
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread running - "+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t0 = new Thread(r); // we create Thread class object because start() method is present only in Thread Class
      //  t0.start();  // new Thread created and task executed
        r.run(); // no new thread executed task executed my main thread
        System.out.println(Thread.currentThread().getName());
    }

}
