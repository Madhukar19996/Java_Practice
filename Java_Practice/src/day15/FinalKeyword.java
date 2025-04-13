package day15;

class Test 
{
	final int x=100;
}




public class FinalKeyword {

	public static void main(String[] args) 
	{ Test t= new Test();
	
	
	t.x=200; // not possible  change the value of x .x is final variable  
	System.out.println(t.x);
	



	}

}
