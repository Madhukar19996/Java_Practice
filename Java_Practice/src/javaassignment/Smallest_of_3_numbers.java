package javaassignment;

public class Smallest_of_3_numbers {

	public static void main(String[] args) 
	
	{
		// WAP smallest_of_3_numbers using if else condition 
		
		int a=5 , b=2, c=9;
		
		if (a<b && a<c)
		{
			System.out.println("a is smallest number:"+a);
		}
		else if (b<a && b<c)
		{
			System.out.println("b is smallest number:"+b);
		}
		else
		{
			System.out.println("c is smallest number:"+c);
		}
		

	}

}
