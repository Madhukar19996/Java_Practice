package day9;

import java.util.Arrays;

public class ReverseaString {

	public static void main(String[] args) 
	
	{
		// Mehtod1: length(), charAt()
		
		/*String name="Madhukar";
		String rev="";
		
		for(int i=name.length()-1;  i>=0;i--)
		{
			rev= rev+name.charAt(i);
		}
		
		System.out.println("Reverse String is :"+rev);*/
		
		
		//Method2 :Converting String into a character type Array.
		
		/*String s="Selenium";
		char a[]=s.toCharArray();// This will convert string to character type array
		String rev="";
		System.out.println(Arrays.toString(a)); //[S, e, l, e, n, i, u, m]
		
		for(int i =a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse of String:"+ rev);*/
		
		
		//Method3: Using StringBuffer 
		
		/*StringBuffer s =new StringBuffer("Python");
		System.out.println(s.reverse()); // nohtyP
		*/
		
		//Method4: Using StringBuilder 
		
		StringBuilder s =new StringBuilder("Mohit");
		System.out.println(s.reverse()); // tihoM
				
				
		

	}

}
