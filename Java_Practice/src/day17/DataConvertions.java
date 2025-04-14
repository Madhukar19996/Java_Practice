package day17;

public class DataConvertions {

	public static void main(String[] args) {
		// String---> int
		
		// String s="Welcome"; // cannot convert to number
		
		/*String s1="100";
		String s2="200";
		
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		*/
		
		/*String s1="10.5";
		String s2="13.5";
		
		
		double sum=Double.parseDouble(s1)+Double.parseDouble(s2);*/
		
		//Sting ---> boolean 
		
		/*String s="true";
		
	    boolean boolvalue=Boolean.parseBoolean(s);*/
		
		
		//String --->char  // cannot convert is not possible 
		 //String ch ='A';
		//Character.parse
		
		
		//Scenario 2: int , double, bool, char ---> String 
		
		int x=100;
		String s1=String.valueOf(x);
		
		double d=12.5;
		String s2=String.valueOf(d);
		
		boolean b=true;
		String s3=String.valueOf(b);
		
		char c='A';
		String s4=String.valueOf(c);
		
		//Scenario 3: int ---> double 
		
		/*int x1=10;
		
		double d1=x1;
		System.out.println(d1);*/
		
		
		// double ---> int 
		
		double d1=10.2;
		int x1=(int)d;
		System.out.println(x1); //10 
		
		
		
		
		
		
		

	}

}
