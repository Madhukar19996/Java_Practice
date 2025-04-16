package day18;

// Cat ct = (Cat) an;
// A   b     C    d

class Animal{}

class Dog extends Animal{}


class Cat extends Animal{}

		

public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
	//	Animal an= new Animal();
		
		Animal an= new Dog();
		Cat ct= (Cat)an;

	}

}
