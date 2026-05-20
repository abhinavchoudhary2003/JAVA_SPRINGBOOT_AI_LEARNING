class StaticVariable 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.display(); // s1 = CFS
		
		Student s2 = new Student();
        s2.CollegeName = "CodeForSuccess"; // Student.CollegeName = "CodeForSuccess"; // Because college Name is static variable 
		s2.display(); // s2 = CodeForSuccess // we cant write like this Student.display(); because display is non static method 
		
		System.out.println("-------------------------");
		
	    s1.display(); // NOw s1 become CodeForSuccess
		              // Because it contains only one copy for all objects in method area 
		
	}
}
