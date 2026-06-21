package WithSynchronization;


// We can use syncroniztion with block ane method only
class BankAccount
{
    int bal=10000;


     // synchronized with method
/*   public void withdraw(int amount)
    {
        if(bal>=amount)
        {
            System.out.println();
            System.out.println(Thread.currentThread().getName()+" is going to withdraw ₹ "+amount+ " Total bal : "+bal);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread InterruptedException ");
            }

            bal=bal-amount;    //
            System.out.println(Thread.currentThread().getName()+" completed withdraw: Remaining bal = ₹"+bal);

        }
        else {
            System.out.println("Not enough balance for "+Thread.currentThread().getName());
        }
    }

 */

    public void withdraw(int amount)
    {
        if(bal>=amount)
        {
            System.out.println();
            System.out.println(Thread.currentThread().getName()+" is going to withdraw ₹ "+amount+ " Total bal : "+bal);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread InterruptedException ");
            }
            // Synchronized with block
           synchronized (this) {
               if (bal >= amount) {
                   bal = bal - amount;    //critical section
                   System.out.println(Thread.currentThread().getName() + " completed withdraw: Remaining bal = ₹" + bal);
               }
           }
        }
        else {
            System.out.println("Not enough balance for "+Thread.currentThread().getName());
        }
    }
}


class Person extends Thread
{
    BankAccount account;
    Person(String name,BankAccount account)
    {
        super(name);
        this.account=account;
    }

    @Override
    public void run() {
        account.withdraw(5000);
    }
}

public class WithSyncDemo {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();

        Person pati = new Person("pati",account);   //t1
        Person patni = new Person("patni",account);  //t2
        Person child = new Person("child",account);  //t2

        pati.start();
        patni.start();
        child.start();
    }
}

// output
/*  Synchroized with method
pati is going to withdraw ₹ 5000 Total bal : 10000
pati completed withdraw: Remaining bal = ₹5000

child is going to withdraw ₹ 5000 Total bal : 5000
child completed withdraw: Remaining bal = ₹0
Not enough balance for patni
 */

 /* output synchronized with block
   child is going to withdraw ₹ 5000 Total bal : 10000
pati is going to withdraw ₹ 5000 Total bal : 10000
patni is going to withdraw ₹ 5000 Total bal : 10000
child completed withdraw: Remaining bal = ₹5000
pati completed withdraw: Remaining bal = ₹0

 there is no data inconsistency here but in output  for patni it should show not enough balance but it did not show
 Because other than synchronized block there is multithreading happening in code  so maybe patni thread did not reach to enough balance condition
  */