package day19;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("===Program is started===");
		
		//Example 1
		/*System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num); // ArithematicExceptions 
		
		System.out.println("===Program is completed===");
	*/
		
		//Example2:
		/*int a[]= new int[5];
		System.out.println("Enter the Position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		a[pos]=value;   //ArrayIndexOutofBoundsExceptions
		*/
		
		
		//Example3:
		
		/*System.out.println("Enter a number:");
		
		String s =sc.next();
		
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);*/
		
		//Example4:
		
		String s=null;
		
		System.out.println(s.length());  //NullPointerException
		
		
		
		
		
		
		
		
		System.out.println("===Program is completed===");

	}

}
