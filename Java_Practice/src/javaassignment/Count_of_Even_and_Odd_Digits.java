package javaassignment;

import java.util.Scanner;

public class Count_of_Even_and_Odd_Digits {

	public static void main(String[] args) 
	{
		// WAP to count of even and odd digits.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int num=sc.nextInt();
		
		int sum=0;
		int count_even=0;
		int count_odd=0;
		while(num!=0)
		{
			int unit =num%10;
		
			sum=sum+unit;
			num=num/10;
			
			if (unit%2==0)
					{
				System.out.println("Even Number :"+ unit);
				count_even=count_even+1;
				
					}
			else
			{
			
				System.out.println("Odd Number :"+ unit);
				count_odd=count_odd+1;
			
		}
		
	}

		System.out.println("Total Even Number :"+ count_even);
		
		System.out.println("Total odd Number :"+ count_odd);
}
}