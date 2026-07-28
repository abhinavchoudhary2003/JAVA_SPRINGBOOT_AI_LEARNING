package org.cfs;

public class Student {
    Course course;  // property or field
   // We need default constructor to create an object because when we are creating an object without using parametrized constructor like this Student s = new Student();
    Student()
    {
        System.out.println("Student default constructor....");
    }
  // Here we are creating parametrized constructor of student but we donot use this parametrized constructor to create an object of student bean  so that's why we need default constructor

   // 1st way Define Constructor Injcetion
    public Student(Course course) {
        System.out.println("Using constructor Injection ");
        this.course = course;
    }
    // 2nd way Define Setter Injection
    public void setCourse(Course course) {
        System.out.println("Using Setter Injection");
        this.course = course;
    }

    void learning(){
        course.start();;
        System.out.println("learning started....");
    }
}
