package JAVA8;

@FunctionalInterface
interface Calculator{
     // one abstract method
   int operation(int a,int b); // // implicitly: public abstract int operation(int a , int b)

    // But It can have any number of private, static , default methods
 /*    default void sum1(){
         System.out.println("default method");
     }
     private void sum2(){
         System.out.println("private method");
     }
     static void sum3(){
         System.out.println("static method");
     }

  */
}
@FunctionalInterface
interface Print{
    void display(String name);
}

public class FunctionalDemo {
    public static void main(String[] args) {

//  implementation of abstract method inside the  functionalInterface using lambda expression
        Calculator c = (a,b) ->{
         return a+b;
        };
        int result = c.operation(10,10);
        System.out.println(result);


    // functionalInterface implementation
        Print p = (name) -> {
            System.out.println(name);
        };
        p.display("ashwani");

//        Print p1 = (name -> System.out.println(name));
//        p1.display("abhinav");
    }
}