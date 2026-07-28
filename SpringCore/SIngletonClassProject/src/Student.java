public class Student {

  // 1st way to create a singleton class
  // So here  static creates only one copy of this variable exists when class compile
  // we create a student object and initialise a static Student variable
// so This static Student object is created only once, and getInstance() will always return that same object
//  static Student student = new Student();
//  public static Student getInstance(){
//      return student;
//  }

   // 2nd way
   static Student student;
    static public Student getInstance()
    {
        if(student==null)
        {
            student=new Student();
        }
        return student;
    }
}
