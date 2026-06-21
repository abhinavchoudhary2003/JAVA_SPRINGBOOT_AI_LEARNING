package ThreadPreventionMethods;


class TeaMaker extends Thread
{
    @Override
    public void run() {
        try {
            System.out.println("Boiling water....");
            Thread.sleep(4000); // try catch because Thread.sleep() is a checked exception
            System.out.println("Tea is ready");
        }
        catch (InterruptedException e)
        {
            System.out.println("Tea Making interrupted ");
        }
    }
}


public class SleepDemo {
    public static void main(String[] args) {
        TeaMaker tea=new TeaMaker();
        tea.start();
        tea.interrupt();
    }
}