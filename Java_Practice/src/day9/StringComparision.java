package day9;

public class StringComparision {

	public static void main(String[] args) 
	{
		// Case1:
		
		/*String s1="Madhukar";
		String s2="Madhukar";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		*/
		
		//Case2:
		
		/*String s1= new String("Madhukar");
		String s2=new String ("Madhukar");
		
		System.out.println(s1==s2); //false //= used for comparing objects 
		System.out.println(s1.equals(s2)); //true  //equals() used for comparing values 
		*/
		
		//Case3:
		
		/*String s1="abc";
		String s2=new String ("abc");
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); //true
		*/
		
		//Case4:
		
		String s1="abc";
		String s2= new String("abc");
		String s3=s2;
		
		System.out.println(s1==s2);  //false 
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2==s3); // true Here objects are same 
		System.out.println(s1.equals(s2));// true 
		
		
		
		
		
		
		

	}

}
