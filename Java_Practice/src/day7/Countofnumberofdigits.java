package day7;

public class Countofnumberofdigits {

	public static void main(String[] args) {
		// Write a program to count the number of digits in an array 
		int num= 43322343;
		
		int count=0;
		
		while(num>0) 
		{
			num=num/10;
		    count++;
		}
		
		System.out.println("Number of digits :"+count);
	}

}
