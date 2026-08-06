package ThreadGroup;

class MyThread extends Thread{
 public  MyThread(ThreadGroup group, String name){
  super(group,name);  // calls Thread(ThreadGroup, String) to set this thread's group and name.
                      // Since MyThread extends Thread, calling super(group, name) inside MyThread's constructor invokes the parent class's (Thread class) constructor — specifically the overload Thread(ThreadGroup group, String name)
 }

    @Override
    public void run() {
        System.out.println("Thread name : "+Thread.currentThread().getName() + " Group :" + Thread.currentThread().getThreadGroup().getName() );
    }
}
public class ThreadGroupDemo {
    public static void main(String[] args) {
      //  This creates a group named "API-group"
    ThreadGroup apigroup = new ThreadGroup("API-group");

      //  Creating Threads Under That Group
    MyThread t1 = new MyThread(apigroup, "API-Thread1");
    MyThread t2 = new MyThread(apigroup, "API-Thread2");
    t1.start();
    t2.start();


    }
}
