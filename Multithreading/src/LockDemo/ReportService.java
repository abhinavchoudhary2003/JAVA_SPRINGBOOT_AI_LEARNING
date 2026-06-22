package LockDemo;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReportService {
    public final Lock lock=new ReentrantLock();

    public void generateReport() throws InterruptedException {

        //if(lock.tryLock()) // only one thread acquire lock i.e. Thread-1 reach tryLock() first. and sleeps for 1 second while holding the lock. and A few microseconds later:  thread 2 and thread 3 reach  lock.tryLock();But the lock is already owned by thread-1.


        // tryLock() doesn't "take" a thread. It just means: "try once, and if busy, give up instantly — don't wait at all." It's pure luck/timing which thread happens to call it first and grab the lock. It's not a rule that exactly one thread will succeed — it's just that with no waiting allowed, only whoever's already there when the lock is free will get in, and that happened to be one thread in your test.
        // tryLock(3,TimeUnit.SECONDS) means I will wait up to 3 seconds hoping to get the lock. if lock is free then current thread acquire the lock then move to Thread.sleep(1000)
        // Thread.sleep(1000) :  "I now HAVE the lock.let me pause 1 sec doing the work.This is about holding the lock,  and then it goes to  finally block and then release the lock for current thread
        // now lock is release , now 2nd thread do the same step and then 3rd thread.
        // tryLock(N, unit) = "check, and if busy, wait up to N time units before giving up"


        //One doubt but when we have 5 threads in a thread pool then  4th and 5th thread is not acquiring the lock  why ?
        // Because, we are submitting three tasks only and there are no tasks left for 4th and 5th thread.

         if(lock.tryLock(3,TimeUnit.SECONDS))
        {
            try {
                System.out.println(Thread.currentThread().getName()+" generating report");
                Thread.sleep(1000);
               //  Thread.sleep(2000); output pool-1-thread-1 generating report
                //                           pool-1-thread-3 generating report
                //                            pool-1-thread-2 could not get lock
                // beacuse it will pause the lock for 2 seconds after getting the lock so third thread will not get lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(Thread.currentThread().getName()+" could not get lock");
        }
    }
}

/* (lock.tryLock())

   Thread-1 -> acquires lock
Thread-1 -> sleep(1000)

 Here, thread 2 and thread 3 doesn't wait for lock (for 3seconds) ,  they will  check  once, and if  lock is busy, and then give up immediately
Thread-2 -> tryLock() -> false -> exits
Thread-3 -> tryLock() -> false -> exits

Thread-1 -> unlock()
Thread-2 and Thread-3 are not waiting. They already gave up.

So when Thread-1 releases the lock, nobody is there to take it.
 */


/* tryLock(3, TimeUnit.SECONDS)

Time 0 ms
----------
Thread-1 -> acquires lock
Thread-1 -> sleep(1000)

Thread-2 -> waiting for lock (up to 3 sec)
Thread-3 -> waiting for lock (up to 3 sec)

Time 1000 ms
------------
Thread-1 -> unlock()

One waiting thread wakes up

Let's say Thread-2 gets it:

Thread-2 -> acquires lock
Thread-2 -> sleep(1000)

Thread-3 -> still waiting
Then:

Time 2000 ms
------------
Thread-2 -> unlock()

Thread-3 -> acquires lock
 */


