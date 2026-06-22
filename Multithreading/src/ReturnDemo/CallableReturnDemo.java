package ReturnDemo;

import java.util.concurrent.*;

public class CallableReturnDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

          // assign a task
          // this is inside main thread, but it will execute by pool threads
        Callable<Integer> email = () ->{
            System.out.println("sending email...");
            Thread.sleep(10000); // this does not show error here beacuse callable already throws exception internally
            return 200;
        };

        Future<Integer> future = executorService.submit(email); // execute by main thread

        System.out.println("doing the work..."); // main thread

        Thread.sleep(2000); // main sleeo for 2 sec
        Integer res = future.get(); // main thread  call future.get() but it will block here for 10 sec  becuase email task is not finished yet and after waiting email task returns 200
        System.out.println("result = "+res);  // main thread print result
        executorService.shutdown(); // main thread
    }
}
