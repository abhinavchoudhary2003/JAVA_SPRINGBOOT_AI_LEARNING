class StringBuilderAndBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Abhinav"); // previous object
		sb.append("Choudhary");//// Here does not create a new object just modify the previous object
		System.out.println(sb);
		
		
		// StringBuffer 
		StringBuffer buffer = new StringBuffer("Sonika"); // previous 
		buffer.append("Bala"); // Here does not create a new object just modify the previous object
		System.out.println(buffer); 
	}
}
