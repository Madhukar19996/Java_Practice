package javaassignment;

import java.util.Scanner;

public class Reverse_a_number {

	public static void main(String[] args) 
	{
		// WAP TO reverse a given number from User.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num=sc.nextInt();
		
		int rev=0;
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num=num/10;
		
		
		
		  
		}
		System.out.println("Reverse Number is :"+ rev);

	}

}
