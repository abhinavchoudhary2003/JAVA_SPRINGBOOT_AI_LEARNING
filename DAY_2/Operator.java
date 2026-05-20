class Operator 
{
	public static void main(String[] args) 
	{
		// Arithmetic operator 
		int a = 10;
		int b = 20;
			System.out.println("a+b " + (a+b)); // addition
			System.out.println("a-b " + (a-b)); // sub
			System.out.println("a*b " + (a*b)); // multiply
			System.out.println("a/b " + (a/b)); // div
			System.out.println("a%b " + (a%b)); // modulo
			
			
			// Increment(++) and Decrement(--)
			
			int c = 9;
			System.out.println("Preincrement "+ ++c); // print 10 (phele + kro then print)
			System.out.println("postincrement "+ c++); // print 10 (phle print kro then ++) so NOw c =11
			
			System.out.println("PreDecrement "+ --c); // print 10 (phle -- then print)
			System.out.println("PostDecrement "+ c--); // print 10 (phle print then -- ) so now c = 9;
			
			
			System.out.println(c); 
			
			
			// Relational Operator
			
			int d = 40;
			int e = 30;
			System.out.println("d==e " + (d==e)); // false If we write like this ("d==e " + d == e); it gives error that both operands are diffe types Java will read as  ("d==e " + d) == e 
			System.out.println("d!=e " + (d!=e)); // true
			System.out.println("d>e " + (d>e)); // true
			System.out.println("d<e " + (d<e)); // false
			System.out.println("d>=e " + (d>=e));// true
			System.out.println("d<=e " + (d<=e)); // false
			
			
			// logical operators 
			
			boolean flag1 = true;
			boolean flag2 = false;
			boolean flag3 = true;
			
			System.out.println(flag1 && flag2); // false
			System.out.println(flag1 && flag3);// true
			System.out.println(flag1 || flag2); // true
			System.out.println(!(flag1&&flag2)); // true
			
			
			// Assignment operators
			
			int f = 5;
			System.out.println(f);
			
			
			int g = 20;
			int h = 8;
			
			g += h;// g = g + h
			System.out.println(g); // g =28
			
			g -= h ; // g = g-h;
			System.out.println(g); // g = 20
			
			g *=h ; // g = g * h
			System.out.println(g); // g = 160
			
			g /= h; // g = g / h
			System.out.println(g); // g = 20
			
			g %= h; // g = g %h
			System.out.println(g); // g =4 
				
				
			

	}
}
