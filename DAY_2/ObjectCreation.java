class Student
{
	String name; // variables or properties 
	int age;
	void study(){ // method or actions
		System.out.println(name + " is studying ");
		System.out.println("My age is" + age);
	}
}

public class ObjectCreation 
{
	public static void main(String[] args) 
	{
		Student std = new Student(); // object creation
		// Assiging values to class student
		std.name = "Abhinav Choudhary";
		std.age = 23;
		std.study();// calling method
	}
}
