package Assignment6;

public class DemoPattern {

	public static void main(String[] args) {

		// Write a program to print below pattern

		/*	

		 1   
         21  
         321 
         4321
		 */

		int i, j,k;

		for(i=1;i<=4;i++)  // Outer loop → rows
		{
			k=i;          // Reset k for each row
			
			for(j=1;j<=4;j++)  // Inner loop → columns

				if(j<=i)
				{
					System.out.print(k--);   // Print current k, then decrement

				}
				else
				{
					System.out.print(" ");  // Print space if column > row
				}
			System.out.print("\n");    // Move to next line

		}



	}




}


