package day13;

public class StaticDemo {
	
	static int a=10;  // It is static variable
	
	 int b=20; // non static variable 
	 
	  static void m1() // static method 
	 {
		 System.out.println("This is a static method...");
	 }
	  
	  void m2() // non static method 
	  {
		  System.out.println("This is non static method ");
	  }
	  
	  void m() // non static 
	  {
		 System.out.println(a); 
		 System.out.println(b);
		 m1();
		 m2();
	  }
	  
	  static void main()
	  {
		  
	  }

	/*public static void main(String[] args) 
	{
		//System.out.println(a);
		//m1();
		//main();
		
	//	System.out.println(b); // we cannot access bcoz b is non static
	// 	m2();                 // we cannot access bcoz b is non static
		
		StaticDemo st =new StaticDemo();
		//System.out.println(st.b);
		//st.m2();
		
		st.m();
		*/

	}


