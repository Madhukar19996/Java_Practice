package day18;

//Upcasting -converting value from smaller --> larger
//float--->double
//int ---->long


//Downding -converting value from  larger ---> smaller

//double-->float
//long-->int 

public class TypeCastingConcepts {

	public static void main(String[] args) {
		
		//Upcasting --automatic --smaller to larger
		
		/*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		
		float floatvalue=12.5f;
		
		double doublevalue=floatvalue;*/
		
		
		//downcasting -manually--> larger-->smaller
		
		
		/*long longvalue=10000;
		int intvalue=(int)longvalue;
		
		double doublevalue=123.44;
		float floatvalue=(float)doublevalue;*/
		
		//Example 1:
		/*int i=100;
		double d=i;  //upcasting 
		System.out.println(d);  //100.0*/
		
		
		//Example 2:
		
		double d=10.5;
		int i=(int)d; //downcasting 
		System.out.println(i);
		
		
			
		
		
		
		

	}

}
