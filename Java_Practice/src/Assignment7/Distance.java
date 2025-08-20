package Assignment7;

public class Distance {
	
	int Kilometer,Meter,Centimeter;
	
	

	public void setValues(int kilometer, int meter, int centimeter ) {
		
		Kilometer=kilometer;
		Meter=meter;
		Centimeter=centimeter;
		
		
	}
	
	public void DisplayValues() {
		
		System.out.println(Kilometer+"Km "+Meter+"M "+Centimeter+"Cm");
	}

    
	public void addDistanceTwoValue(Distance d1,Distance d2) {
		
		Kilometer=d1.Kilometer+d2.Kilometer;
		Meter=d1.Meter+d2.Meter;
		Centimeter=d1.Centimeter+d2.Centimeter;
		
		System.out.println("Here is your addition of two distances: "+Kilometer+"km "+Meter+"m "+Centimeter+" cm");
	}
	
	
	public static void main(String[] args) {
		
		Distance d1=new Distance();
		Distance d2=new Distance();
		Distance d3=new Distance();
		
		d1.setValues(10, 20, 30);
		d1.DisplayValues();
		
		d2.setValues(20, 30, 50);
		d2.DisplayValues();
		
		d3.addDistanceTwoValue(d1, d2);
		d3.DisplayValues();
		
		
		
		
		
	  
		

	}

}
