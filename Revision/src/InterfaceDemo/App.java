package InterfaceDemo;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
//        Payment p = new Payment();
       Payment p = new UpiPay();
       p.pay();

    }
    }

