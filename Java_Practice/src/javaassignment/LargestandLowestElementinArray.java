package javaassignment;

public class LargestandLowestElementinArray {

	public static void main(String[] args) 
	{
		// Largest and Lowest Number in a array.
		
		
		/*int a[]= {30,20,45,67,28,10};
		
		int max=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		 System.out.println("Largest Element in an array is :"+max);
		 */
		
		
        int a[]= {30,20,45,67,28,10};
		
		int min=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		 System.out.println("Largest Element in an array is :"+min);


	}

}
