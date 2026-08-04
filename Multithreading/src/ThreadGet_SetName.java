class  Mythread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
        System.out.println("line executed by current thread : "+Thread.currentThread().getName());
    }

}
public class ThreadGet_SetName {

    public static void main(String[] args) {
                                          // Here Thread-0 name was initialize during thread object creation
      Thread t0 = new Thread(new Mythread()); //When you create a new thread with new Thread(new Mythread()), the Thread constructor automatically assigns it an internal name using an auto-incrementing counter ("Thread-" + nextThreadNum()).
                                             // Therefore, t0 is named Thread-0 from the moment it is constructed.
      // getName
      String name = t0.getName(); // Asks the object t0, "What is the name assigned to you inside your instance variables?"
        System.out.println("default name of thread : " +name);


        System.out.println("line executed by current thread : "+Thread.currentThread().getName()); // Asks the JVM, "Which thread is currently executing this line of code right now?"

        // setName
      // t0.setName("Mythread-0"); // set custom name of Thread
        System.out.println("update Thread Name :"+t0.getName());

       t0.start(); // t0.start() requests the OS to spawn Thread-0, and then Thread-0 independently executes run() method .



    }
}
/*
Key Realization
Creating a Thread object does not switch execution to that new thread, nor does it mean that line is running inside that thread.

In your code:

The main thread creates a new object representing a thread (t0).
The main thread asks t0 what its name parameter is set to. t0 answers "Thread-0".
The main thread prints "default name of thread : Thread-0".
Notice that you never called t0.start(). The worker thread (t0) hasn't even started running yet—it's just a passive Java object sitting in memory while the main thread inspects its properties!

What it looks like when t0 actually runs
If you add t0.start() and check Thread.currentThread().getName() inside the run() method, you will see the difference clearly:
 */