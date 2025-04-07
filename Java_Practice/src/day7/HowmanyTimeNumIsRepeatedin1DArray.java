package day7;

import java.util.Scanner;

public class HowmanyTimeNumIsRepeatedin1DArray {

	public static void main(String[] args) {
		// How many Time Number Is Repeated in 1-D Array
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Element:");
		int num=sc.nextInt();
		int a[]= {2,5,8,9,1};
		int dublicate_element_count=0;
		boolean status=false;
		for(int i=0;i<=4;i++)
		{
			if(num==a[i]) 
			{
				dublicate_element_count++;
				status=true;
				System.out.println("Dublicate Element in array is :"+dublicate_element_count);
			}
		
		
	}
		if(status==false)
		{
			System.out.println("Dublicate Element in array is :"+dublicate_element_count);
		}

	}
}
