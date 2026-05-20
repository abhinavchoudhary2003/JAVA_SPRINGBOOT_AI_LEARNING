package DynamicDispatcher;

public class MyChild extends MyParent{

    void display(){
        System.out.println("child class methos");
    }
   @Override
    void m1() {
       System.out.println("child m1() ");

    }

}
