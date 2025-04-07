package javaassignment;

public class MissingElementInArray {

	public static void main(String[] args) 
	{
		// WAP to print missing number in an array 
		
		//Numbers should be in range.
		//Should not have duplicates.
		//No need of sorting order.
        
		int a[]= {1,2,3,4,5,6,7,8,10};
		int sum1=0;
		int sum2=0;
		
		for (int i =0; i<=a.length-1;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements in a array"+sum1);
		
		for(int i=1; i<=10;i++)
		{
			sum2=sum2+i;
		}

		System.out.println("Sum of elements in a array"+sum2);
		System.out.println("Missing number is :"+(sum2-sum1));
		
		

	}

}
