package ExceptionDemo;

public class ExceptionInDepth {
    public static void main(String[] args) {
        showRoom();

    }
    public static  void showRoom(){
        System.out.println("let's see car");
     testDrive();
    }
    public static void testDrive(){
        System.out.println("test Drive");

        // if we handle this calling method we still not able to print output of done() method from where the actual code breaks
       // try {

            // here it does not handle paperWork() method
            // it handling the call to paperWork() from testDrive()
            // try-catch is only watching if paperWork() throws an exception BACK to testDrive()

            paperWork();// 3rd  code break  here after calling this method because this code call that method where the exception is present
        //    } catch (Exception e) {
       //    e.printStackTrace();
        }
    //     priceDiscount(); //if we did not handle paperWork() it is not calling this method and does not print of this method statement because as we know that from where the code breaks it does not print anything after that
   public static void paperWork(){
        System.out.println("submit all papers");
        done(); // Second code break in this method exception present

    }
    public static void done(){
     //   try {

            System.out.println(10/0); //   code  breaks HERE first  ← actual break point exception
     //   } catch (Exception e) {
            System.out.println("payment done...");

       // }

    }
    public static void priceDiscount(){
        System.out.println("bhai thoda theek thak lga le");
    }

}
