package day17;

public class WapperClassesDemo {
	
	

	public static void main(String[] args) {
		
		int a =10; // Primitive variable
		
		double d=12.5; // Primitive variable
		
		char c='A';
		boolean b=true;
		
		//converting primitives to object type- Auto boxing 
		
		Integer aobj=a; // object 
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		
		System.out.println(aobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		
		
		//converting objects to primitive type- Un boxing
		
		 int intvalue=aobj;
		 double doublevalue=dobj;
		 char charvalue=cobj;
		 boolean boolvalue=bobj;
		 
		 
		 System.out.println(intvalue);
			System.out.println(doublevalue);
			System.out.println(charvalue);
			System.out.println(boolvalue);
			
			//int x=100;
			Integer x=100;
			
			
		

	}

}
