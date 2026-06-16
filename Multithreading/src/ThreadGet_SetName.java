class  Mythread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }

}
public class ThreadGet_SetName {

    public static void main(String[] args) {
      Thread t0 = new Thread(new Mythread());
        // Default Thread name is initialize at object creation time inside the constructor
      // getName
      String name = t0.getName(); // default name
        System.out.println("default name of thread : " +name);

        System.out.println("line executed by current thread : "+Thread.currentThread().getName()); // used to get current thread name

        // setName
       t0.setName("Mythread-0"); // set custom name of Thread
        System.out.println("update Thread Name :"+t0.getName());





    }
}
