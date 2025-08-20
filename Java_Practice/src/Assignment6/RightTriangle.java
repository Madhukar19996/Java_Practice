package Assignment6;

public class RightTriangle {

	public static void main(String[] args) {
		
	// Write a program to print right triangle 
		
	/*	
	    
	    *
		**   
		***  
		**** 
		*****
  */
		
		int i, j;
		
		for(i=1;i<=5;i++)
		{
		for(j=1;j<=5;j++)
			
			if(j<=i)
		    {
			  System.out.print("*");
		    }
			else
			{
			  System.out.print(" ");
			}
		System.out.print("\n");
		
		}



	}

}
