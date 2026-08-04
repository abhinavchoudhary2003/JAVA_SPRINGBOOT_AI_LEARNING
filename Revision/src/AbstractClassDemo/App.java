package AbstractClassDemo;

public class App {
    public static void main(String[] args) {
       // Payment p = new Payment(); // object creation is not possible for Abstract class
       // But constructor of abstract class  is possible  because when there is a parent child relationship between classes so when we call the child constructor object creation first it calls parent constructor then child constructor
        Payment p = new InternetBanking(); // here Refernce is Payment and object creation is of InternetBanking class
        p.pay();
      //  p.anything(); // cannot call child method because this is not present in payment class and it is not overriden by child class

      InternetBanking ib = new InternetBanking();
      ib.anything(); // here reference is internet banking and object creation is also of InternetBanking Class


    }
}
