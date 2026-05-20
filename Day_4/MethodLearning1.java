class MethodLearning1 
{
	public static void main(String[] args) 
	{
		System.out.println("Learn about method with return and parameters");
		
		System.out.println("---------------------------");
	
		int result = sum(10,20);// directly call sum method because sum method use static and here  declare a variable(result) and assign values to parameters.
		System.out.println(result); 
		
		// create a object because sum1 method did not use static 
		MethodLearning1 m = new MethodLearning1();
		int result1 = m.sum1(30,40);
		System.out.println(result1); 
		
		
	}
	
	 // Create a method with static and return and two parameters 
	public static int sum(int par1 , int par2){
		
		return par1+par2;
	}
	// Create a method without static
	public  int sum1(int par1 , int par2){
		
		return par1+par2;
	}
	
}
