package day12;
// Passing copy the value 
public class CallByValue {

	public static void main(String[] args) {
		Test test=new Test();
		
		int number=100;
		
		System.out.println("Before method:"+number); //100
		
		  test.m1(number);
		
		System.out.println("After method:"+number);  //100
	}

}
