package day7;

import java.util.Scanner;

public class TakingMultipleInputs {

	public static void main(String[] args) 
	{
		// Taking Multiple Inputs
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("Sum of two number:" +(num1+num2));
	}

}
