package javaassignment;

public class SumOfElementInArray {

	public static void main(String[] args) 
	{
		// Sum Of Element In Array
		
		int a[]= { 3,6,2,5,7,};
		int sum=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of elememt is in array is :"+ sum);
			
			
		

	}

}
