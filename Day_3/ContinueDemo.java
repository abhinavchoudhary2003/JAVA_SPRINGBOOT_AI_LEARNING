class ContinueDemo 
{
	public static void main(String[] args) 
	{
		// print even number
		for(int i=1;i<=10;i++){
			
		//	if(i%2==0){
		//		System.out.println(i);
			//}
			
			
			if(i%2 !=0){ // means when  remainder is not zero it skips the current value of i (it does not print the current value of i) and immediately moves to the next iteration of i
				continue;
				
			}
			System.out.println(i);
			
		}
	}
}
