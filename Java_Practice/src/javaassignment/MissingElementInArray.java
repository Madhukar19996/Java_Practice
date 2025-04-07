package javaassignment;

public class MissingElementInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,5};
		int range[]= {1,2,3,4,5};
		int sum1=0;
		int sum2=0;
		int sub=sum2-sum1;
		
		for(int i=0; i<=3;i++)
		{
			sum1=sum1+a[i];
			
			
			
		}
		for(int i=0; i<=range.length-1;i++)
		{
			sum2=sum2+a[i];
			
			
			
		}
		
		 
		 System.out.println("Sum of Sum1 is"+sum1);
		 System.out.println("Sum of Sum2 is"+sum2);
		 System.out.println("Missing Number of an array is"+ sub);
		
		

	}

}
