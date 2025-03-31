package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	
	{
		// Arithmetic operators  + - * / %
		
		
		int a=10, b=30;
		
		System.out.println("Sum of a and b:" +(a+b));
		System.out.println("Sum of a and b:" +(a-b));
		System.out.println("Sum of a and b:" +(a*b));
		System.out.println("Sum of a and b:" +(a/b));
		System.out.println("Sum of a and b:" +(a%b));
		
		// Relational and comparison operators >  >=  <  <= != ==
		// Return boolean value -- true/false 
		
		System.out.println(a<b);  // true 
		System.out.println(a<=b); // true
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		// Logical Operator &&  ||  !
		// return boolean value -- true / false 
		// works between 2 boolean values 
		
		boolean x=true;
		boolean y =false;
		
		System.out.println(x&&y); // false
		System.out.println(x||y); // true
		System.out.println(!x);   // false 
		System.out.println(!y);   // true 
		
		
		
		boolean b1= 10>20;
		
		System.out.println(b1); // false
		
		boolean b2=20>10;
		
		System.out.println(b2); // true 
		
		System.out.println(b1 && b2); // false 
		System.out.println(b1 || b2); // true
		
		System.out.println((10<20) && (20>10 )); // true 
		System.out.println((10<20) || (10>20 )); // true 
		System.out.println(!(10<20)); // false 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				

	}

}
