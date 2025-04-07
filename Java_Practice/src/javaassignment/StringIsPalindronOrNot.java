package javaassignment;

public class StringIsPalindronOrNot {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		String s="MADAM";
		String rev="";
		String org_str=s;
		
		for(int i=s.length()-1; i>=0;i--)
		{
			rev =rev+s.charAt(i);
		}
		
		if(s.equals(rev)) 
		{
			System.out.println("Palindron"+" "+rev);
		}
		 
		else 
		{
			System.out.println(" Not a Palindron"+" "+rev);
		}
	}

}
