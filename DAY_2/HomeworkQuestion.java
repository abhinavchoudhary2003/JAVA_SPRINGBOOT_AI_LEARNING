// Create class with main method where we need to access Bank class
/* Bank class have
bankName
City
Ifsc code
Pincode */

class Bank{
	String bankName;
	String City;
	int ifscCode;
	int pincode;
	void bankDetails(){
		System.out.println("Bank is" + bankName);
		System.out.println("City is" + City);
		System.out.println("ifscode is" + ifscCode);
		System.out.println("Pincode" + pincode);
	
	
	}
}
public class HomeworkQuestion
{
	public static void main(String[] args) 
	{
		Bank bnk = new Bank(); // create onject
		bnk.bankName = "HDFC";// assign values 
		bnk.City = "Nurpur";
		bnk.ifscCode = 23417658;
		bnk.pincode = 176051;
		bnk.bankDetails();// call bank method
		
		
	}
}
