package RunnableDemo;

 class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Task running in thread "+Thread.currentThread().getName());
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        // why we still need to create a Thread object
        // Because Thread class only contains start() method
        Thread t0  = new Thread(r);
        t0.start();
        Thread t1=new Thread(r);
        t1.start();
    }

}
