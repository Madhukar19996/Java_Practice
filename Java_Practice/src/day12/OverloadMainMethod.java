package day12;

public class OverloadMainMethod {

	 void main(int a)  //1
	{
		System.out.println(a);

	}
	 
	 
	 void main(int a, int b) //2
		{
			System.out.println("Sum is:"+(a+b));

		}
	
	
	public static void main(String[] args) 
	{
		OverloadMainMethod ov =new OverloadMainMethod();
		
		ov.main(5);
		
		ov.main(300, 200);

	}

}
