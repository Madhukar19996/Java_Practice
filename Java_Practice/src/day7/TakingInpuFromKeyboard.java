package day7;

import java.util.Scanner;

public class TakingInpuFromKeyboard {

	public static void main(String[] args) 
	{
		// Taking Input From Keyboard
		
		// int a =100;  // Hard code 
		
		Scanner sc =new Scanner(System.in);
		// System.out.println("Enter a number: ");
		/*int a=sc.nextInt();
		
		System.out.println("Given value of a is :"+a);*/
		
		// Decimal Number 
		/*System.out.println("Enter a decimal number:");
		double num=sc.nextDouble();
		System.out.println("Given decimal number is :"+ num);*/
		
		// String 
		
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Your name is :"+ name);

	}

}
