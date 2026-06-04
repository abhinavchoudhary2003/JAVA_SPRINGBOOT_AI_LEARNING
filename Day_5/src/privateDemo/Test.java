package privateDemo;
 // one class is student
class Student {
    private int pin=132;

    private void showPin()
    {
        System.out.println("Pin is : "+pin);
    }

    // Here we can access pin and showPin() beacuse we can  access  private within the same class
    void verify()
    {
        showPin();
    }
//    private class College{
//
//    }
}
// Another class is Test,  so we cannot access pin and showPin() outside the student class directly
public class Test {
    public static void main(String[] args) {
        Student s=new Student();

        //System.out.println(s.pin);  //error: pin is private
    //    s.showPin(); // error show pin has private accesss
    s.verify(); //
    }
}
