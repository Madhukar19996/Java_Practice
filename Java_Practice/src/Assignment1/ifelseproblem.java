package Assignment1;

 public class ifelseproblem {
	
	public static void main(String[] args) {
	
	int age=25;
	char gender= 'f';
	
	if(age>50 && gender=='m')
	{
		System.out.println("Male:Your age is above 50 years. Please pay 10 INR");
	}
	
	if(age<=50 && gender=='m') 
	{
		System.out.println("Male:Your age is below or equal to 50 years. Please pay 20 INR");
	}
	
	if(age<=30 && gender=='f') 
	{
		System.out.println("Female:Your age is below or equal to 30 years. Please pay 40 INR");
	}
	
	if(age>30 && gender=='f') 
	{
		System.out.println("Female:Your age is above 30 years. Please pay 50 INR");
		
		
	}
	
 }

}