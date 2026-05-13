class InstanceVariable 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.displayEmp(); // print 1 and arjun
		
		Employee emp2 = new Employee();
		emp2.displayEmp(); // print 1 Arjun that we initialize in employee class 
		//
		emp2.id = 2; // update emp2 object and their instance variable value
		emp2.name="hariya";
		System.out.println("-----------------------------");
		emp2.displayEmp(); // print 2 and hariya
		emp1.displayEmp(); // print 1 and Arjun
		// why it does not affect emp1 , beacuse in heap each object contains separate space in heap
	}
}
 