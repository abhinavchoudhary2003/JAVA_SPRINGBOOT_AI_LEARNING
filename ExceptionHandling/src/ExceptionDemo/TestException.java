package ExceptionDemo;

public class TestException {
    public static void main(String[] args) {

        // Here before using try catch when we run this code it prints only 1st sout statement and after that
        // it shows exception and breaks the flow of execution of code

//        System.out.println("before risky code");
//        System.out.println(10/0); // risky code
//        System.out.println("after risky code");



        // here  it prints "before risky code" first and then risky code came it goes to catch block and print that statements i.e. in catch block, but it does not print the remaining statements in try block  where our code breaks(means risky code)
        // and print remaining statements that are outside the try catch line by line
        // so with the help of try catch it does not break the execution flow of code, but it ,show the exception error because of this line e.printStackTrace();
        try{
            System.out.println("before risky code");
            System.out.println(10/0); // risky code
            System.out.println("after risky ");

        } catch (Exception e) {
            System.out.println("in catch block");
        //    e.printStackTrace(); // this line shows exception error
        }

        System.out.println("after risky code");
        System.out.println("CFS");
    }
}
