package Assignment7;

public class Time {
	
	int hour,min,sec;
	
	void setvalue(int a, int b,int c)
	{
		hour=a;
		min=b;
		sec=c;
	}
	 
	void displayvalue(String country)
	{
		System.out.println("Your Time in " +country +" "+ hour +"hours "+min+"mins "+sec+"secs");
		
	}
	

	public static void main(String[] args) {
		
		Time t1=new Time();
		Time t2=new Time();
		t1.setvalue(5, 35, 2);
		t2.setvalue(1, 7, 45);
		t1.displayvalue("India");
		t2.displayvalue("U.K");
		

	}

}
