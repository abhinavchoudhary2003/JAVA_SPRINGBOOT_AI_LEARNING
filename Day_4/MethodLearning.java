class MethodLearning 
{
	public static void main(String[] args) 
	
	{
		System.out.println("learn about when we need static method or not to call");
		
		System.out.println("-------------------------------------------------");
		print(); // call method
		System.out.println("-------------------------------------------------");
		MethodLearning  m = new MethodLearning();
		m.print1(); // call method
	}
	//Method without return & without parameter
	public static void print(){
		System.out.println("Directly Call method when your method use static");
	}
	
	
	public void print1(){
		System.out.println("Create an object when we dont use static in method");
	}
		
	
	
}
