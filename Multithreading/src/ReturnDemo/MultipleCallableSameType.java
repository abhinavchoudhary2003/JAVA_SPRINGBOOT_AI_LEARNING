package ReturnDemo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MultipleCallableSameType {
    public static void main(String[] args) throws ExecutionException, InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // using callable to assigns a two task with same  data type(string)
        Callable<String> salaryTask = () -> {
            System.out.println("calculating salary by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return "45000.0";
        };

        Callable<String> email = () -> {
            System.out.println("sending email by" + Thread.currentThread().getName());
            Thread.sleep(1000);
            return "done";
        };


        List<Callable<String>> tasks = Arrays.asList(salaryTask, email); // add Tasks with same return type in a list
        List<Future<String>> restults = executor.invokeAll(tasks); // its like executor.submit(task) and here it submit all tasks

        System.out.println("Hr doing rangoli work.....");


        System.out.println("------------------final results-----------------");
        for (Future<String> future : restults) {
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
