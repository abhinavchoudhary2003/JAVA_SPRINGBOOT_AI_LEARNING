class ArrayDemo 
{
	public static void main(String[] args) 
	{
		
		// Declare an array int arr[]; or int[] arr;
		
		
		// Instantiation of an array means is a process of allocating memory to an array
		//int arr[] = new int[5]; 
		
		// Assigning values to an array 1st way
		/*arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		*/
		
		// 2nd way instantiation and assign values at same time in an array
		int arr1[] = {10,20,30,40,50};
		
		// Accessing elemnets of an array 
		// Using for loop
		/*for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		*/
		// Using for each loop
		
		for(int data : arr1){
			System.out.println(data);
		}
		
		System.out.println("length of an array :" + arr1.length);
		
	}
}
