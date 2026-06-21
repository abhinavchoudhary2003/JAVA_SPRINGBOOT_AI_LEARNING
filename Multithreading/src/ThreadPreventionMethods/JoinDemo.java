package ThreadPreventionMethods;

class WashingMachine extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Washing started....");
            Thread.sleep(3000); //just sleep for 3 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Washing finished....");
//  getName(); // directly call without refernce variable because washingmachine class extends thread so washmingmachine can access all properties of Thread
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException  {
        WashingMachine wash=new WashingMachine();
        wash.start();

       // Here main() thread is going to waiting state because join() ko humne main thread ke area mai call kraa hai
       // wash() thread ke completely execute hone ke baad hee main() thread chlege
        wash.join(); // school friend
//        wash.join(3000);// college friend
//        wash.join(3000,100); // office friend

        System.out.println("Now start drying clothes....");
    }
}





//        //wash.join(2000); //college friend
//        wash.join(2000,100);
