package day16;

public class MultiInheritance  implements I1 ,I2{
	public void m1()
	{
		System.out.println("This is m1...");
	}
	
	public void m2()
	{
		System.out.println("This is m2..");
	}

	public static void main(String[] args) {
		
		MultiInheritance mi= new MultiInheritance();
		mi.m1();
		mi.m2();
		System.out.println(mi.x);
		System.out.println(mi.y);
		
	}

}
