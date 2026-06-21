package JAVA8;

public class RunnableWithJava8 {
    public static void main(String[] args) {
    // one way implementation of run() abstract method
//    Runnable r = (()->{
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Task");
//        }
//    });
//    Thread t = new Thread(r);
//    t.start();


     // Second Way
    // implementation of run() method
    // And run() is an  inside Runnable interface with the annotation of  functionalInterface so it is an only abstract method in an interface
        Thread t=new Thread(()->{
            for(int i=0;i<5;i++)
            {
                System.out.println("Task");
            }
        });
        t.start(); // execute run() method
        for(int i=0;i<5;i++)
        {
            System.out.println("Main");
        }
    }
}