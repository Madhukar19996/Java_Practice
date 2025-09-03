package InterviewJavaProgram;

public class PrimeNumber {
	
	int val=10;
	
	
	public static void primeNumber(int a )
	{
		boolean flag=false;
		for(int i=2; i<+31/2;i++)
		{
			
			if(i%2==0) 
			{
			  flag=true;
			  break;
			}
		}
		if(flag=false) 
		{
			System.out.println("It is a prime number");
		}
		else
			System.out.println("It is not prime number");
			
	}
	

	public static void main(String[] args) {
		
		primeNumber(31);
		  

	}

}
