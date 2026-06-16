package AbstractDemo;

public class App {
    public static void main(String[] args) {

 //Payment p=new Payment();
        Payment p = new CardPayment();
        System.out.println(p.a);
        p.invoice();
        p.pay();






    }

}
// //Payment p=new Payment();
//        Payment p = new CardPayment();
//        System.out.println(p.a);
//        p.invoice();
//        p.pay();