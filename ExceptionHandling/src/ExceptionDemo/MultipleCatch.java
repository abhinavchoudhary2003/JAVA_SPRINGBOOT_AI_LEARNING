package ExceptionDemo;

import java.lang.Exception;

public class MultipleCatch {
    public static void main(String[] args) {
      int result = data();
        System.out.println(result);
    }
    public static int data(){
    int arr[] = {1,0,2,4,24,34};
    try{
  //  int res = arr[0] / arr[1]; // Arithmetic exception
    int    res = arr[20]; //  ArrayIndexOutOfBoundsException
      return res;
      }
      catch (ArithmeticException e){  // Specific first
        System.out.println("Arithmetic exception");
    }
    catch(ArrayIndexOutOfBoundsException ex){ // specific first
        System.out.println("ArrayIndexOutOfBoundsException");
    }
    catch (Exception ee){ // genereal last
        System.out.println("parent class of all exceptions");
    }

// Note :  1. JVM checks catch blocks TOP to BOTTOM Whichever matches FIRST → runs that one → skips all others
      //   2. They of way of handling an exception is varied from exception to exception. Hence, for every exception
      // type it is recommended to take a separate catch block. That is try with multiple catch block

        // 3. And "Always catch the most specific exception that you expect from that particular code, instead of catching a generic Exception"

   // why this fails    because Exception is parent class of both Arithmetic and ArrayIndex so  Exception catches everything \
   // And it will not reach child classes
//catch (Exception e)                    // ← PARENT class (catches EVERYTHING)
//catch (ArithmeticException ex)         // ← child class (DEAD CODE - never reached)
//catch (ArrayIndexOutOfBoundsException) // ← child class (DEAD CODE - never reached)
//        try{
//            int res = arr[0] / arr[1]; // Arithmetic exception
//            res = arr[20]; //  ArrayIndexOutOfBoundsException
//            return res;
//    } catch (Exception e) {
//        System.out.println(" all exception caught");
//
//    }
//    catch (ArithmeticException ex){
//            System.out.println("Arithmetic exception");
//
//    }
//    catch ( ArrayIndexOutOfBoundsException ee){
//        System.out.println(" ArrayIndexOutOfBoundsException");
//    }



    return 0;

    }
}
