package ConstructorDemo;

public class Employee {

    int id;
    String Name;
    String dept;


    // Default Constructor with no parameter
    // If we don't create this jvm will automatically call this , because this is present internally
    // If we remove this default constructor ,and we create an object with constructor call,  it shows error in ConstTest.java
    // Because jvm removes default constructor when we create our own constructors
    // But you can create own default constructor to avoid this problem
    Employee()
    {
        System.out.println("Constructor....");
    }


    //  here we can see that we can make Multiple constructor for one class with different parameters
    Employee(int id){
        this.id = id;

    }

    Employee(int id , String Name , String dept){
        this.id = id;
        this.Name = Name;
        this.dept = dept;
    }



     //Not a good programming
    // Create a getter and setter method  to get variables and set values to that variables
    public String getName() {
        return Name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
