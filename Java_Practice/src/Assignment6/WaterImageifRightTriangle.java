package Assignment6;

public class WaterImageifRightTriangle {

	public static void main(String[] args) {


		int i,j;
		
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=5;j++)
			{ 
				if(j<=5-i)
					
				System.out.print("*");
				
				else
					
				System.out.print(" ");
			}
			
			System.out.print("\n");
		}

	}

}
