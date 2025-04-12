package day15;

public class Animal {
	
	String color="white";
	
	void eat()
	{
		System.out.println("Eating ..");
	}
	
	Animal()
	{
		System.out.println("This is Animal");
	}
	
	Animal(String name)
	{
		System.out.println(name);
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
	
	Dog()
	{   //super(); // invoke parent class constructor 
		//System.out.println("This is Dog");
	}
	
	Dog(String name)
	{
		super(name);
	}

}
