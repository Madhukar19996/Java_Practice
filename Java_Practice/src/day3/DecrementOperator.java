package day3;

public class DecrementOperator {

	public static void main(String[] args) 
	
	{
		int a=100;
		
		a=a-1;
		System.out.println(a);  // 99
		
		
		// Post Decrement 
		
		int a1=100;
		//a1--;
		int res=a1--;
		System.out.println(res);
		
		// pre Decrement 
		
		int a2=100;
		//a2--;
		int res1=--a2;
		System.out.println(res1);
		res1--;
		System.out.println(res1);
		
		
		
		
		

	}

}
