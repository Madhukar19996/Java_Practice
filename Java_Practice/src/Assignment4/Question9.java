package Assignment4;

public class Question9 {

	public static void main(String[] args) {
		
		int x=457;
		int sum =0;
		int r=0;
		int rev=0;
		int count=0;
		int d=100;
		
		
		while(x>0)
		{   
			
		 r=x%10;
		 x=x/10;
		 count++;
		 
		 rev=rev + (r*d);
		 d=d/10;
		 sum=sum+r;
		 
			
		
		}
		
		System.out.println("sum of digits:"+sum);
		System.out.println("Number of digits:"+rev);
		System.out.println("Number of digits:"+count);
		
					



	}

}
