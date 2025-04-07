package day7;

public class NumberofEvenAndOddNumbersIn1DArray {

	public static void main(String[] args) {

		// Even and Odd Number In Array
		
		int a[]= {2,9,6,3,5};
		int even_element=0;
		int odd_element=0;
		
		for(int i =0; i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
			  even_element++;
			  
			  
			}
			else 
			{
				odd_element++;
				
			}
		}
		System.out.println("Even Element count in array is :"+even_element);
		System.out.println("odd Element count in array is :"+odd_element);
		
	}

}
