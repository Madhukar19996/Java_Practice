package day15;

class Bank
{
    double roi()
	 {
		 return 0;
	 }
    
    
}

class Axis extends Bank
{
	 double roi()
	 {
		 return 12.5;
	 }
    
}

class SBI extends Bank
{
	 double roi()
	 {
		 return 7.5;
	 }
    
}

public class OverridingDemo {

	public static void main(String[] args) 
	{
		Axis ax= new Axis();
		System.out.println(ax.roi()); //12.5 
		
		SBI sb= new SBI();
		System.out.println(sb.roi());  //7.5

	}

}
