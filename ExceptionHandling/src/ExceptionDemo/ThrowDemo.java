package ExceptionDemo;

public class ThrowDemo {
    public static void main(String[] args) {

  validateAge();
    }
    public  static void validateAge( ){
        int age=0;
        if(age<18){
//          System.out.println(10/0); // here jvm created the exception object ,and  it is handled by DEH if it is catch then it is, handle by catch block

      throw new IllegalArgumentException("User Exception"); // here user throw its own exceptionn and create its own exception object
      }
        System.out.println("Age is valid ");
    }

}
