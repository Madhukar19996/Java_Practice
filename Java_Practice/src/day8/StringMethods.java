package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		//String s="Welcome";
		
		//String s1= new String ("Welcome");
		//System.out.println(s);
		
		//length()- returns length of the string 
		
		String s="Welcome";
		
		//int len =s.length();
		//System.out.println(len);  // 7 
		
		System.out.println(s.length()); //7
		
		//concat()-join string 
		String s1="Welcome";
		String s2=" to Java";
		String s3="Programming";
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		//System.out.println(s1+s2+s3);
		
		
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("Welcome"+"to java");
		System.out.println("Welcome".concat(" to java"));
		
		//trim()-  remove spaces right and left side 
		s1="   Madhukar   ";
		System.out.println("Before trimming:"+s1.length());//14
		
		s2=s1.trim();
		System.out.println("After trimming:"+s2.length());//8
		
		
		//charAt()- returns a character based on index 
		// index starts from 0
		
		s3="Welcome";
		System.out.println(s3.charAt(3));
		System.out.println(s3.charAt(6));
		
		//contains()- returns true/false 
		// check a string is the part of the main string 
		
		System.out.println(s3.contains("wel")); // false 
		
		System.out.println(s3.contains("Wel")); // true 
		System.out.println(s3.contains("Welome")); //false 
		
		//equals() , equalIgnoreCase()- compare 2 strings 
		// returns true/false 
		
	   s1="welcome";
	   s2="welcome";
	   System.out.println(s1.equals(s2)); // true 
	   System.out.println(s1.equals("Welcome"));// false
	   System.out.println(s1.equalsIgnoreCase("welcome"));// true 
	   
	   //replace() - replace single character/ sequence of character in a string 
	   
	   s="welcome to selenium java python python automation";
	   System.out.println(s.replace('s','M')); // welcome to Melenium java python python automation
	   System.out.println(s.replace("python", "c#")); // welcome to selenium java c# c# automation
	   
	   
	   // substring()- extract substring from the main string 
	   
	   s="welcome";
	   
	   System.out.println(s.substring(2,5)); //lco
	   System.out.println(s.substring(1,4)); //elc
	   
	   //toUpperCase() toLowerCase - converting case
	    s="Welcome";
		System.out.println(s.toUpperCase()); // WELCOME// convert to upper case
	
		System.out.println(s.toLowerCase()); //welcome//  convert to lower case 
		
		
		
		//split() - split/divide the string in to multiple parts based on the delimeter.
		
		//Example1:
		/*s="abc@xyz";
		
		String data[]=s.split("@");
		System.out.println(data[0]); //abc
		System.out.println(data[1]); //xyz*/
		
		
		//Example2:
		/*s="abc@gmail.com";
		String data[]=s.split("@");
		
		System.out.println(data[0]); //abc
		System.out.println(data[1]); //gmail.com*/
		
		//Example3: -replace()
		
		String amount ="$15,20,55";
		
		System.out.println(amount.replace("$","").replace(",","")); //152055
		
		//Example4:- split()
		// s="abc,123@xyz";         //output abc , 123 , xyz 
		 /*String a1[]=s.split(",");
		 System.out.println(Arrays.toString(a1)); //[abc, 123@xyz]
		 
		 System.out.println(a1[0]); //abc
		 System.out.println(a1[1]); //123@xyz
		 
		 String a2[]=a1[1].split("@");
		 System.out.println(a2[0]); //123
		 System.out.println(a2[1]);// xyz*/
		
		/*s="abc,123@xyz";
		
		String firststring=(s.split(",")[0]); //abc
		String secondstring=(s.split(",")[1].split("@")[0]);
		String thirdstring=(s.split(",")[1].split("@")[1]);
		System.out.println(firststring);
		System.out.println(secondstring);
		System.out.println(thirdstring);*/
		
		
		
		//Example5:
		s="abc 123 xyz";
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr)); //[abc, 123, xyz]
		
		
		
		
		 // * % & ( ) ^ -you cannot use as delimeters .
		
		//Problem
		String name ="Madhukar Pandey";
		
		System.out.println(name.contains("madhukar")); //false
		System.out.println(name.toLowerCase().contains("madhukar")); //true 
		System.out.println(name.replace('M','m').contains("madhukar")); //true 
		System.out.println(name);
		
		 
		 
		 
		 
		
		
		

		
		
		
		
		
		
		

	}

}
