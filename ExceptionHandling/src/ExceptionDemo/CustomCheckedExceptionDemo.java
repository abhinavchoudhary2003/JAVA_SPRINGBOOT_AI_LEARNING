package ExceptionDemo;

public class CustomCheckedExceptionDemo {
    public static void main(String[] args) {
    try {
        checkMarks(120);
    } catch (InvalidMarksException e) {
        System.out.println("exception: "+e.getMessage());

    }

    }
    public static void checkMarks(int marks) throws InvalidMarksException {

    if(marks<0 || marks>100){
        throw  new InvalidMarksException("marks must be between 0 and 100");
    }
        System.out.println(" Marks saved in Db:" +marks);
    }


}
// it shows error in checkMarks() because exception contains both checked and unchecked Exception
// and jvm force us to handle checkedException otherwise it is getting failed
// Here Creating a class of CustomException
class InvalidMarksException extends Exception{
 // class InvalidMarksException extends RuntimeException // if we use it shows no error because it is a unchecked exception and jvm cannot force us to handle this exception

 // constructor
 // we must have to transfer the object to parent exception
 public  InvalidMarksException(String message){
   super(message); // calling its parent class
 }

}
