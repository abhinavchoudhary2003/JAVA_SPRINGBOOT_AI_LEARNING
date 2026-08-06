package InterThreadCommunication;

class  weddingHall{
 boolean dinnerReady = false;
}
class  Guest extends Thread {
    weddingHall hall;

    Guest(weddingHall h) {
        hall = h;
    }

    @Override
    public void run() {
        synchronized (hall) {
            System.out.println("Guest Enter in the hall...");
            while (!hall.dinnerReady) {
                System.out.println("Dinner not ready. Guest Please wait....");
                try {
                    hall.wait();
                    System.out.println("getting lock back..");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Guest is having dinner");
        }
    }
}

    class Chef extends Thread{
      weddingHall hall;
      Chef(weddingHall h)
      {
      hall = h;
      }

        @Override
        public void run() {
        synchronized (hall) {
            System.out.println("Chef started preparing dinner....");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
            hall.dinnerReady = true;
            System.out.println("chef: Dinner is ready");
            hall.notify();
        }
        }
    }

public class ComDemo {
    public static void main(String[] args) {
        weddingHall hall = new weddingHall();
        Guest guest = new Guest(hall);
        Chef chef = new Chef(hall);
        guest.start();
        chef.start();
    }
}
