package MutlthreadingDemo;

import java.sql.SQLOutput;

class MyRunnable2 implements Runnable{
    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println("thread is running: " +i+" by "+Thread.currentThread().getName());
       }
    }
}
public class SecondProgram {
    public static void main(String[] args) {

        Thread t0 = new Thread(new MyRunnable2()); // Here Thread-0 name was initialize during thread object creation
      //  t0.start(); // t0.start() does not run run() directly on the main thread.  t0.start() requests the OS to spawn Thread-0, and then Thread-0 independently executes r2.run().

        System.out.println("name of thread:"+t0.getName()); // // Asks the object t0, "What is the name assigned to you inside your instance variables?"


        System.out.println("line executed by current thread : "+Thread.currentThread().getName()); // Asks the JVM, "Which thread is currently executing this line of code right now?"

        t0.setName("MyThread-0");
        System.out.println("name of thread:"+t0.getName());

    }
}
