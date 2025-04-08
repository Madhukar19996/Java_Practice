package day11;

public class Greeting 
 { // 1) No para  no return value
	
	
	void m1() 
	{
		System.out.println("Hello");
		
		
	}
	
	// No Params Return value 
	
	String m2()
	{
		return ("Hello How are you ?");
	}
	
	
	//3). Takes params no return 
	
	void m3(String name)
	{
		System.out.println("Hello " + name);
	}
	
	
	//4). Takes param return value 
	
	String m4(String name)
	{
		return("Hello "+name);
	}

 }
