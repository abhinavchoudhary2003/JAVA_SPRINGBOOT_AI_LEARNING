package ExceptionDemo;

public class FinallyDemo {
    public static void main(String[] args) {
       int res = div(10, 1); // case 1 no exception
     //   int res = div(10, 0); // case 2 if there is an exception
    }
    public  static  int div(int a , int b){
    int res =0;

    try{
        System.out.println("Inside try");
        System.out.println(a/b);
        System.out.println("exception raised");
    }
    catch (ArithmeticException e){
        System.out.println("Exception catched");
        System.out.println("exception inside catch");
      // System.out.println(10/0); // case 2 when exception inside catch
    }
    // Finally always starts — but if an exception occurs inside finally itself,
    // it behaves just like any other method — stops at that line and crashes the program
    // So always write clean up code in finally don't write any risky code inside this
    finally {
      //   System.out.println(10/0); //  exception here so step here  and print statements never prints
        System.out.println("finally block executed");

    }
    return res;
    }

}
