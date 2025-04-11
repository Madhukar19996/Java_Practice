package day14;


class A
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
}

class B extends A 
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}


class C extends B
{
	int c;
	
	void print()
	{
		System.out.println(c);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) 
	{
         /*B obj=new B();
         
         obj.a=10;
         obj.b=20;
         obj.display();
         obj.show();*/
		
		C obj=new C();
		
		
		obj.a=100;
        obj.b=200;
        obj.c=300;
        obj.display();
        obj.show();
        obj.print();
		
		
		
		


	}

}
