package Assignment6;

public class LeftTriangle {

	public static void main(String[] args) {

		// Write a program to print left triangle 

/*
 Output :

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
			{
				if(j>=6-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.print("\n");

		}
	}

}
