package day18;

class Parent
{
	String name="Madhukar";
	
	void m1()
	{
		System.out.println("This is m1 from Parent...");
	}
}
class Child extends Parent 
{
	 int id =101;
	 void m2()
	 {
		 System.out.println("This is m2 from Child...");
	 }
}

public class TypecastingObjects1 {

	public static void main(String[] args) {
		
		/*Child c=new Child();  
		System.out.println(c.name);  //Parent 
		c.m1();                      //Parent
		System.out.println(c.id);   //Child
		c.m2();                    //Child 
		*/
		
		/*
		Parent p=new Child(); //Upcasting 
		System.out.println(p.name);   //Parent
		p.m1();                       // Parent
		
		System.out.println(p.id);  //we cannot access 
		p.m2();  //we cannot access
		*/
		Parent p =new Parent();
	//  Child c= new Parent(); // Downcasting 
		Child c= (Child)p;
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();

	}

}
