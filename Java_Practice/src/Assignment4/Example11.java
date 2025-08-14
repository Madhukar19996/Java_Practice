package Assignment4;

public class Example11 {

	public static void main(String[] args) {
		
		int x=1234;
		
		int count =0;
		
		while(x>0)
		{
			x=x/10;
			count++;
		}
		
	   if(count==3)
			
		{
		System.out.println("Number of digits :"+count);
		System.out.println("It is a three digits number");
		
		}
		else	
		{   System.out.println("Number of digits :"+count);
			System.out.println("It is  not a three digits number");
		}

	}

}
