package WithoutSynchronization;

class BankAccount
{
    int bal=10000;

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

            bal=bal-amount;    // critical section
            System.out.println(Thread.currentThread().getName()+" completed withdraw: Remaining bal = ₹"+bal);

        }
        else {
            System.out.println("Not enough balance for "+Thread.currentThread().getName());
        }
    }
}


class Person extends Thread
{
    BankAccount account;
    // constructor
    Person(String name,BankAccount account)
    {
        super(name); // used to set name of threads
        this.account=account;
    }

    @Override
    public void run() {
        account.withdraw(5000);
    }
}

public class WithoutSynchroniztionDemo {
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

/*
Output:
child is going to withdraw ₹ 5000 Total bal : 10000
patni is going to withdraw ₹ 5000 Total bal : 10000
pati is going to withdraw ₹ 5000 Total bal : 10000
child completed withdraw: Remaining bal = ₹5000
patni completed withdraw: Remaining bal = ₹-5000 // data consistency here because after completed withdraw remaining balance should be 0
pati completed withdraw: Remaining bal = ₹0 // how pati can complete withdraw because no balance left after patni and child withdraws
                                            // here ouput must be  Not enough balance for pati


 why is this happening because three threads shares critical section at same time
 */




