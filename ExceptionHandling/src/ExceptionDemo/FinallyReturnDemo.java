package ExceptionDemo;

public class FinallyReturnDemo {
    public static void main(String[] args) {
   //  m1(); // case 1 when there is no exception
    int res = m2();
        System.out.println(res);


    }
    // Case 1
//    public  static void m1(){
//       try{
//           System.out.println("try block executed");
//           return;
//       }catch(ArithmeticException e){
//           System.out.println("catch block executed");
//       }
//       finally {
//           System.out.println("finally block executed");
//       }
 //   }
    // Case 2
  public static int m2(){
  try{
      System.out.println(10/0); // exception occurs
      return 777;
  }catch (ArithmeticException e){// goes here and return 111

      return  111;

  }
  finally { // but as we know that finally will always be executed so it override the 111 and return 7676
     //  System.exit(0); // jvm will stop
      return 7676;
  }
  }


}
