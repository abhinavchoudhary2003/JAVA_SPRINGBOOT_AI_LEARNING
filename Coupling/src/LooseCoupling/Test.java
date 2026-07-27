package LooseCoupling;

public class Test {
    public static void main(String[] args) {

       // Here Test class performs this Dependency injection ways
       
       // 1st way to create an object of DSA class by using student constructor
        Student s1 = new Student(new DSA());
        s1.learn();


        // 2nd way to create an object of  SpringBoot class by using setter method of Student class
        Student s2 = new Student();
        s2.setCourse(new SpringBoot());
        s2.learn();


    }
}
