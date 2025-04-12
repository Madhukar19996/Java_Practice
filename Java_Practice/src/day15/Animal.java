package day15;

public class Animal {
	
	String color="white";
	
	void eat()
	{
		System.out.println("Eating ..");
	}


}

class Dog extends Animal
{
	String color="back";
	
	void display()
	{
		System.out.println(super.color);
	}
	
	
	
	void eat()
	{
		//System.out.println("Eating Bread");
		super.eat();
	}
}
