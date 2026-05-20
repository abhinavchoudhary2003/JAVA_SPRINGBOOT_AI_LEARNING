package OverridingDemo;

import InheritanceDemo.Hariya;

public class OverRiding extends Hariya {   // till now this is inheritance beacuse we can still call methods in Test.java

    @Override
    public void gold() {
       System.out.println("200kg gold"); // change implementation of parent class method
    //super.gold(); //  if we us this it calls the parent class method

    }

    @Override
    public void plot() {
    System.out.println("1000 gaj plot"); // change implementation of parent class method
     //   super.plot(); // it calls the parent class method
    }
}
