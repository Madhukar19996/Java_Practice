package day7;

public class CountEvenandOddNumberinArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int num=5467643;
		int even=0;
		int odd=0;
		
		
		while (num>0)
		{
			int reminder=num%10;
			if(reminder/2==0)
			{
				even++;
				System.out.println("Count of Even Number is :"+ even);
				
			}
				
			
			else 
			{
				odd++;
				System.out.println("Count of odd Number is :"+ odd);
				

			}
			
			num =num/10;
			
			
		}

	}

}
