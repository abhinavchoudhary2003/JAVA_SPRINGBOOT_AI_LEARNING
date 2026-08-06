package MutlthreadingDemo;

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("Thread running - "+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName()); // print thread-0 or thread-1 beacuse ,this method run is executed by t0.start() or t0.start()
         // if t0.run() or t1.run() then it prints main thread
    }

}
public class FirstProgram {
    public static void main(String[] args) {
     MyThread t0 = new MyThread();
      //  System.out.println(Thread.currentThread().getName()); // prints main
    t0.start(); // it means new Thread is created and task is executing by this thread
       // System.out.println(Thread.currentThread().getName()); // still prints main because main thread is executing main() method
 //  t0.run(); // it means no new thread is created and task is executed by main thread only
    MyThread t1 = new MyThread();
    t1.start(); // new thread is  created to execute the task that we define in run() method
    t1.run();
    }
}
