package ConstructorDemo;

public class ConstTest {
    public static void main(String[] args) {

        // Here you can see that if we remove default constructor in employee.java it shows error
        // Because jvm removes default constructor when we create multiple constructor
        Employee e1 = new Employee(); // object creation with constructor call

        System.out.println(e1.id);
        e1.setId(1);
        System.out.println(e1.id);

        Employee e2 = new Employee(2);
        System.out.println(e2.id);

        Employee e3 = new Employee(2,"Abhinav","CSE");
        System.out.println(e3.id);
        System.out.println(e3.Name);
        System.out.println(e3.dept);


    }


}
