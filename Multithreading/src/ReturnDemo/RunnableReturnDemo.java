package ReturnDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableReturnDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable  emailTask=()->{
            System.out.println("sending email "+Thread.currentThread().getName());
          //  return 200; // doesnot return because run() method is void
        };
        executorService.submit(emailTask);
        executorService.shutdown();
    }
}


// output : sending email pool-1-thread-1
// no result because run() is a void method
