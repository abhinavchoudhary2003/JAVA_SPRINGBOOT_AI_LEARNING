class IfElseDemo 
{
	public static void main(String[] args) 
	{
		int bacha = 100;
		
		if(bacha==10){ //1block
			System.out.println("10 wali dairy milk");
			
			if(bacha > 4){ // 2 block 
				System.out.println("Aja meri gaadi mai beth jaa");
				
				bacha = bacha-2;
				if(bacha>2) 
				{
				System.out.println("chlo nashe krte hai..");
				if(bacha == 30000){ // 3 block
					System.out.println("mall khareed lete hai");
					bacha -= 30000;
				}
				else{ // 3 block
					System.out.println("chata padega...");
				}
			}
			else{ // 2 block
				System.out.println("chal hatt gareeb");
				}
			}
		}
	else{ // 1 block
		System.out.println("chlo 5 start hee dedo");
		bacha -= 5;
		if(bacha == 5000){ // 4 block
			System.out.println("oyr ek bmw lgaa");
		}
		else{ // 4 block
			System.out.println("ro mat to ye choti car le jaa wo bhi free....");
		}
		if(bacha >=200){ // 5 block
			System.out.println("orange candy");
		
		}
		else if(bacha>203){ 
			System.out.println("chlo ghumne chalte ha 203");
		}
		else if(bacha>92){
			System.out.println("chlo ghumne chalte ha 92");
		}
		else if(bacha>91){
			System.out.println("chlo ghumne chalte ha 91");
		}
		else{ // 5 block
			System.out.println("main to greeb hu...");
			if(bacha>=1){ // 6 block
				System.out.println("ek old monk de do..");
			}
			else{ // 6 block
				System.out.println("mar khayega kya jaa yha se...");
			}
		}
	}
}
}