package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // creates a thread pool(thread group) for 3 threads only

          // assign a task
        Runnable task1 =() ->{
            String name=Thread.currentThread().getName();
            System.out.println("Task executes by "+name);
        };
        //  submit a task to  the threads for execution . now it's decided automatically  by the ExecutorService's internal thread pool logic (which thread handle which task)
        // here we submit the same task for three times to the threads
//        for (int i=0;i<3;i++){
//            executor.submit(task1);
//        }

       // same way
//        Runnable task2 =() ->{
//            String name=Thread.currentThread().getName();
//            System.out.println("Task executes by "+name);
//        };
//        Runnable task3 =() ->{
//            String name=Thread.currentThread().getName();
//            System.out.println("Task executes by "+name);
//        };
//          Here we submit the different three task to the threads
//         executor.submit(task1);
//         executor.submit(task2);
//         executor.submit(task3);

          // when we submit  six tasks to  3 threads

        for (int i=0;i<6;i++){
            executor.submit(task1);
        }

        executor.shutdown(); // after shutdown() it will no longer accept any tasks and threads inside thread pool will terminate after completing all tasks

    }
}
