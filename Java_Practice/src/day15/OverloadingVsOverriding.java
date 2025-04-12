package day15;

class ABC
{
	void m1(int a )
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
		
	}
	
	
	/*void m2(int a,int b)  //Overloading 
	{
		System.out.println(a+b);
		
	}*/
	
	
	
	/*void m1(int a ) //Overriding method
	{
		System.out.println(a*a);
	}*/
	
	
}

class XYZ extends ABC
{
	void m1(int a ) //Overriding method
	{
		System.out.println(a*a);
	}
	
	void m2(int b)  //Overriding method
	{
		System.out.println(b*b);
		
	}
	
	
	void m2(int a,int b)  //Overloading 
	{
		System.out.println(a+b);
		
	}
	
}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ xyzobj=new XYZ();
		xyzobj.m1(10);
		xyzobj.m2(6);
		xyzobj.m2(10, 10);
		

	}

}
