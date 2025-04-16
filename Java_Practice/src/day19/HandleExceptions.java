package day19;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		//Example1:
		System.out.println("===Program is started===");
		
		/*
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		try 
		{
		System.out.println(100/num); // ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data Provided");
			System.out.println("Number can't be 0 ");
			System.out.println(e.getMessage());
		}
		*/
		//Example2:
		
		int a[]= new int[5];
		System.out.println("Enter the Position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		try
		{
		a[pos]=value;   //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index value is out of range");
			System.out.println("Provide Index value  between (0 to 4) only ");
			System.out.println(e.getMessage());
		
		}
		
		System.out.println("===Program is completed===");



	}

}
