package day7;
import java.util.Scanner;

public class SearchingElementIn1DArray {

	public static void main(String[] args) 
	{
		// Searching of elements in a 1D Array.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Serach Element:");
		int search_num=sc.nextInt();
		int a[]= {2,5,8,9,1};
		boolean status=false;
		for (int i=0;i<=4;i++)
		{
			  
			if(a[i]==search_num)
			{ 
				
				System.out.println("Element found") ;
				 status=true;
				break;
				
				
			}
			
			
			
			
	}
		if(status==false) 
		{
			System.out.println("Element not found") ;
		}

	}
	
}
