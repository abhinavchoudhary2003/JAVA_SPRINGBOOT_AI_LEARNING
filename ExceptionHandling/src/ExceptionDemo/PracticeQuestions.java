package ExceptionDemo;

public class PracticeQuestions {

    public static void main(String[] args) {


        /*    Question 1
           try {
            int[] arr = new int[5];
            arr[10] = 1;
            System.out.println("try");
        } catch (ArithmeticException e) {
            System.out.println("arithmetic catch");
        }

         output exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
         → catch block only runs when exception MATCHES
→ ArithmeticException ≠ ArrayIndexOutOfBoundsException
→ so catch was SKIPPED
         */


         /* Question 2
         try {
        System.out.println("try");
        return;
    } catch (ArithmeticException e) {
        System.out.println("catch");
    } finally {
        System.out.println("finally");
    }
    System.out.println("after try catch");

    O/p : try
          finally
          return → exits the method
 finally→ runs BEFORE the method actually exits
after try catch → only runs if method did NOT return
          */

          /* Question 3
            try {
        int[] arr = new int[5];
        arr[10] = 10/0;  // right side always executes first so here it is ArithmeticException occurs
    } catch (ArithmeticException e) {
        System.out.println("arithmetic");
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("array index");
    } finally {
        System.out.println("finally");
    }
    Output
         arithmetic
         finally

           */
       /*     Question 4
        try {
            System.out.println("try");
            int x = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("catch 1");
        } catch (ArithmeticException e) {
            System.out.println("catch 2");
        }
        Output: Compile error
Why?
catch (ArithmeticException e)  → first catch
catch (ArithmeticException e)  → SAME exception again
Why Compile Error?
Two catch blocks with SAME exception
→ second catch is DEAD CODE
        */

        /*
        Simple Rule 🎯
Exception caught by catch block
→ Default Exception Handler = SILENT

Exception NOT caught by anyone
→ Default Exception Handler = PRINTS and TERMINATES
         */

         /* Question 5
          try {
        method1();
    } catch (Exception e) {
        System.out.println("caught in main");
    }
    public static void method1() {
    try {
        method2();
    } catch (ArithmeticException e) {
        System.out.println("caught in method1");
    }
}
public static void method2() {
    int x = 10/0;
}
Output caught in method1
Exception is caught in method1()
→ never travels to main()
→ main() catch never runs

Exception stops travelling
as soon as it finds a matching catch block

          */

          /* Question 6
           method1();
           public static void method1() {
    System.out.println("method1 start");
    method2();
    System.out.println("method1 end");
}
public static void method2() {
    System.out.println("method2 start");
    int x = 10/0;
    System.out.println("method2 end");
}
output method1 start
method2 start
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Demo.method2(Demo.java:10)
    at Demo.method1(Demo.java:6)
    at Demo.main(Demo.java:2)
           */

           /* Question 7
           try {
        method1();
        System.out.println("main after method1");
    } catch (Exception e) {
        System.out.println("main catch");
    } finally {
        System.out.println("main finally");
    }

public static void method1() {
    try {
        int x = 10/0;
    } finally {
        System.out.println("method1 finally");
    }
}
output method1 finally
       main catch
       main finally
            */

            /* Question 8
             try {
        method1(); // goes here after exception rethrown so its an exception occurs here
    } catch (ArithmeticException e) {  // goes here
        System.out.println("main catch: " + e.getMessage()); // then print this
    }
    public static void method1() {
    try {
        int x = 10/0; // exception occcurs
    } catch (ArithmeticException e) { // goes here
        System.out.println("method1 catch"); // print this
        throw e; // then exception RETHROWN
    }
}
output: method1 catch
        main catch: / by zero
             */

             /* Question 9
               try {
        validate(15); // so exception occurs here
    } catch (Exception e) {
        System.out.println(e.getMessage()); // print this
    }
}
public static void validate(int age) {
    if(age < 18) { // 15< 18 so true
        throw new RuntimeException("not eligible"); //  we create this  user exception
    }
    System.out.println("eligible");
}
Output: not eligible
              */

              /* Question 10
              try {
        method1(); // call this method1 here and this method have an exception
    } catch (Exception e) { // so it goes here
        System.out.println("caught: " + e.getMessage()); // and print this method
    }

public static void method1() {
    throw new RuntimeException("error in method1"); // create a user exception
}
output :caught: error in method1
               */

               /* Question 11
                try {
        System.out.println("try");
        throw new RuntimeException("manual exception");
    } catch (RuntimeException e) {
        System.out.println("catch: " + e.getMessage());
    } finally {
        System.out.println("finally");
    }
Output try
catch: manual exception
finally

                */

                /* Question 12
                try {
        method1();
    } catch (Exception e) {
        System.out.println("main: " + e.getMessage());
    }
}
public static void method1() throws Exception {
    try {
        int x = 10/0;
    } catch (ArithmeticException e) {
        throw new Exception("wrapped: " + e.getMessage());
    }
}
output main: wrapped: / by zero
                 */

                 /*
                   try {
        int x = 10/0;
    } catch (ArithmeticException e) {
        System.out.println("outer catch");
        try {
            int[] arr = new int[5];
            arr[10] = 1;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("inner catch");
        }
    } finally {
        System.out.println("finally");
    }

    output  outer catch
            inner catch
            finally
Key Point 🎯
try inside catch is completely valid
→ outer catch handles first exception
→ inner catch handles second exception
→ outer finally always runs at the end
ONE try block → ONLY one catch runs
TWO try → each try has its OWN catch
        → both catches can run independently
                  */

                  /* Question 14

                 try {
        try {
            System.out.println("inner try");
            int x = 10/0; // ArithmeticException occurs
        } catch (NullPointerException e) { //  does NOT match ❌
                                            // ArithmeticException ≠ NullPointerException
            System.out.println("inner catch");
        }
    } catch (ArithmeticException e) { // matches
        System.out.println("outer catch"); // print it
    }
    output inner try
           outer catch

🎯 Rule is — One try ONE catch RUNS at a time
It does NOT mean exception cannot travel to outer catch
Inner try-catch → first security gate
                → checked ArithmeticException
                → NullPointerException guard here
                → DOES NOT MATCH → passes through

Outer try-catch → second security gate
                → ArithmeticException guard here
                → MATCHES ✅ → caught here
                   */

                   /*
                   Question 14

                   public static void main(String[] args) {
         System.out.println(test());
       }
public static int test() {
    try {
        return 1;
    } finally {
        return 2;
    }
}
output 2
Key Point 🎯
finally return OVERRIDES try return

try    → wants to return 1
finally → returns 2 instead
→ 2 wins always

This is BAD Practice ⚠️
NEVER use return inside finally block
→ it overrides try return
→ confusing and unexpected behavior
→ interviewers love asking this question 😄
                    */

                    /*
                    QUestion 15
                  public static void main(String[] args) {
    System.out.println(test());
}
public static int test() {
    int x = 0;
    try {
        x = 1;
        return x;
    } finally {
        x = 2;
        System.out.println("finally x: " + x);
    }
}
output finally x: 2
1
🎯 Why?
int x = 0
        ↓
x = 1
        ↓
return x → return value 1 is SAVED
        ↓
BUT finally runs before actually returning
        ↓
x = 2
        ↓
prints "finally x: 2" ✅
        ↓
finally has NO return statement
        ↓
saved return value 1 is returned ✅
        ↓
main prints 1 ✅

🎯Note
finally changed x to 2
BUT did NOT have return statement

→ saved return value 1 is still returned
→ main prints 1

                     */

                     /* Question 16
public static void main(String[] args) {
    try {
        finally_test();
    } catch (Exception e) {
        System.out.println("main catch");
    }
}
public static void finally_test() {
    try {
        int x = 10/0;
    } finally {
        System.out.println("finally");
        int y = 20/0;
    }
}

output finally
       main catch

🎯 Confusion is :why the finally block exception did not print by the DEH
 20/0 occurs in finally
        ↓
exception does NOT print HERE immediately
        ↓
it TRAVELS UP to whoever called finally_test()
        ↓
main() has catch block
        ↓
caught in main() ✅
        ↓
prints "main catch"

Key Point 🎯
DEH only activates when
exception is NOT caught ANYWHERE

Here →
2nd exception travelled to main()
main() caught it ✅
DEH had nothing to do ❌
If main() also had NO catch block
THEN DEH would have printed the exception!
                      */

                 /*
                  Question 17
                 try {
        throw new RuntimeException("first");
    } catch (RuntimeException e) {
        System.out.println("catch: " + e.getMessage());
        throw new RuntimeException("second");
    } finally {
        System.out.println("finally");
    }

    output : catch: first
             finally
           Exception in thread "main" java.lang.RuntimeException: second
                  */

                  /*
                  Question 18
public static void main(String[] args) {
    try {
        method1(); // no exception reached main
    } catch (Exception e) { // so it does not go here
        System.out.println("main catch"); // will not print
    }
    System.out.println("main end"); // print
}
public static void method1() {
    try {
        method2();
        System.out.println("method1 after method2");
    } catch (ArithmeticException e) {
        System.out.println("method1 catch");
    } finally {
        System.out.println("method1 finally");
    }
    System.out.println("method1 end");
}
public static void method2() {
    System.out.println("method2 start");
    int x = 10/0;
    System.out.println("method2 end");
}
Output: method2 start
        method1 catch
        method1 finally
        method1 end
        main end
                   */


    }
}
