package day13;

public class StaticMain {
	
	
	public static void main(String[] args) 
	{
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		//main();
		
	
		
		StaticDemo st =new StaticDemo();
		System.out.println(st.b);
		st.m2();
		
		st.m();

	}

}


