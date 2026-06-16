package ThreadDemo;


class MyThread extends Thread{
   @Override
    public  void run(){  // this run()  method is for defines the TASK of thread
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread running - "+Thread.currentThread().getName());
        }
    }
}

public class FirstProgram {
    // all this things handle by main thread only inside main() method
    public static void main(String[] args) {

        MyThread t0= new MyThread();
        t0.start(); //create a new thread and executes run() in it ....., but here main thread executes this start() and request jvm to create a new thread
        // ↑ New Thread-0 is created  and Thread-0 starts executing run()
  //      t0.run();  // Doesn't create a new thread run() executes by  MAIN thread only Just like normal method call!
        System.out.println(Thread.currentThread().getName()); //  it is printing name of main thrad

        MyThread t1= new MyThread();
        t1.start();
        for (int i=0;i<5;i++)  // this is handle by main thread
        {
            System.out.println("main thread...");
        }
   }
}

// Output
/*
this is not is sequence order because both the threads are running parallelly or because of Context Switching
and This sequence decided by Thread Scheduler that which thread will get chance of execution first
main
Thread running - Thread-1
Thread running - Thread-1
Thread running - Thread-1
Thread running - Thread-0
Thread running - Thread-0
Thread running - Thread-0
Thread running - Thread-0
Thread running - Thread-0
Thread running - Thread-0
Thread running - Thread-1
Thread running - Thread-1
Thread running - Thread-1


 */
