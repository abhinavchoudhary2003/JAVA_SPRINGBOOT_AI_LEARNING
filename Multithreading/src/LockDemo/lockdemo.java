package LockDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class  BankAccount{
    private  int balance = 1000;
    private final Lock lock = new ReentrantLock(true); //  true enables "fairness" — it means waiting threads acquire the lock in the order (that we wrote in main) they requested it (first-come-first-served), rather than allowing a thread to "jump the queue.
    void withdraw(int amount){
        lock.lock(); // here thread acquire the lock means one thread at one time
        try{
            System.out.println(Thread.currentThread().getName());
            balance = balance-amount;
            System.out.println("Balance after withdrawl : "+ balance );

        }
        finally {
            lock.unlock(); // release the lock after completing the task
        }
        //stuck in a loop deadlock condition
        // So there is a problem with lock() method if the lock not available ---> thread wait indefinelty ->to fix this we use trylock() method
//   while(true){
//
//
//
//       }


    }
}
public class lockdemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        BankAccount account = new BankAccount();
        // Here we submit the tasks to the pool thread and also assign a task using lambda expression
        executor.submit(()->account.withdraw(500)); // goes to runnable interface(run() method) because withdraw is a void return type
        executor.submit(()->account.withdraw(400));
        executor.submit(()->account.withdraw(100));

        //  System.out.println("Main thread");
        executor.shutdown();


    }
}
