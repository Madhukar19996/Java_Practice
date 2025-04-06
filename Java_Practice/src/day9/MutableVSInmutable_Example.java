package day9;

import java.util.Arrays;

public class MutableVSInmutable_Example {

	public static void main(String[] args) 
	
	{
		int a[]= {20,50,70,40,10};
		int b[]=a;
		System.out.println(Arrays.toString(a)); //[20, 50, 70, 40, 10]
		
		Arrays.sort(a); // mutable -can change 
		
		System.out.println(Arrays.toString(a)); //[10, 20, 40, 50, 70]
		System.out.println(Arrays.toString(b)); //[10, 20, 40, 50, 70]
		
		
		



	}

}
