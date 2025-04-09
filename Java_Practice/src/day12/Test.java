package day12;

public class Test {
	
	
	int number; // class variable or instance variable 
	
	void m1(int number)
	{
		number=number+10; // local variable 
		
		System.out.println("Value in the method:"+number);//110
	}
	
	
	void m2(Test t)
	{
		t.number=t.number+10;
		System.out.println("Value in the method"+t.number);
	}

}
