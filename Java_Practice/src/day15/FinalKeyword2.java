package day15;

final class Test1
{
	final void m1()
	{
		System.out.println("This is m1 from Test1");
	}
}

class Test2 extends Test1
{
	void m1()  // Incorrect .We cannot override final methods 
	{
		System.out.println("This is m1 from Test2..");
	}
}

public class FinalKeyword2 {

	public static void main(String[] args) {
		

	}

}
