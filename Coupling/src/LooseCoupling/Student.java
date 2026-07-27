package LooseCoupling;

public class Student {

  Course course;

  Student(){
  }

    // 1st way constructor dependency injection
  Student(Course course){
  this.course = course;
  }

    //2nd way Setter dependency injection
    public void setCourse(Course course) {
        this.course = course;
    }
    void learn()
    {
        System.out.println("learning started....");
        course.start();

    }

}
