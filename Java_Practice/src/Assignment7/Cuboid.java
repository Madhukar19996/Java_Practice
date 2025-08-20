package Assignment7;

public class Cuboid {

	int length, width, height, volume,surfacearea;


	void Setvalue(int a , int b, int c )
	{
		length=a;
		width=b;
		height=c;

	}
	
	
	void ViewVoulume()
	{
		volume=length*width*height;
		
		System.out.println("Volume of cuboid: "+ volume);
	}
	
	void ViewSurfaceArea()
	
	{
		surfacearea=2*(length*width + width*height + length*height);
		System.out.println("SufacreArea of cuboid: "+surfacearea );
	}


	public static void main(String[] args) {
		
		Cuboid c1=new Cuboid();
		c1.Setvalue(10, 20, 30);
		
		c1.ViewVoulume();
		c1.ViewSurfaceArea();

	}

}
