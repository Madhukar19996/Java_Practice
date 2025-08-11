package Assignment1;

public class Task2 {

	public static void main(String[] args) {
		
		
	    // Swapping of two number using third variable 		
			int a1=20;
			int b1=30;
			int c1;
			c1=a1+b1;
			a1=c1-a1;
			b1=c1-b1;
			
			System.out.println("a1 is: "+a1);
			System.out.println("b1 is:"+b1);
		
		
		
      // Swapping of two number without using third variable 		
		int a=20;
		int b=30;
		
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("a is: "+a);
		 System.out.println("b is:"+b);
		
		
	}

}
