package LooseCoupling;

public class Test {
    public static void main(String[] args) {

       // Here Test class performs this Dependency injection ways
       
       // 1st way to create an object Manually  of DSA class by using student constructor
        Student s1 = new Student(new DSA());
        s1.learn();


        // 2nd way to create an object Manually of  SpringBoot class by using setter method of Student class
        Student s2 = new Student();
        s2.setCourse(new SpringBoot());
        s2.learn();


    }
}

//Note : Here Spring framework comes in picture  to automate this dependency injection ways  to create a beans object automatically