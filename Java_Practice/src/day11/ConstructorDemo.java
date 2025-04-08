package day11;

public class ConstructorDemo 
{ int x,y;


  ConstructorDemo() // Default Constructor 
  {
	  x=10;
	  y=20;
			  
  }
  
  ConstructorDemo(int a ,int b ) //Parameterized Constructor 
  {
	  x=a;
	  y=b;
			  
  }
  
  void sum()
  {
	  System.out.println(x+y);
	  
  }





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConstructorDemo cd= new ConstructorDemo();
		//cd.sum();
		
		ConstructorDemo cd= new ConstructorDemo(200,400);
		cd.sum();

	}

}
