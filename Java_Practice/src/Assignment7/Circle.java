package Assignment7;

public class Circle {

	int  radius;
	float area;
	double circumfrence;

	public void setRadiusValue(int r ) {

		radius=r;
	}

	public void calculateArea() {

		area= (float) (3.14*radius*radius)  ;

	}

	public void calculateCircumfrence() {

		circumfrence=2*3.14*radius ;

	}

	public void viewRadius() {

		System.out.println(radius);
	}

	public void viewArea() {

		System.out.println("Area of Circle is :"+area);
	}

	public void viewCircumfrence() {

		System.out.println("Circumfrence of Circle is :"+circumfrence);
	}

	public static void main(String[] args) {

		Circle c1=new Circle();
		Circle c2= new Circle();

		c1.setRadiusValue(5);

		c1.calculateCircumfrence();
		c1.viewCircumfrence();
		c1.calculateArea();
		c1.viewArea();

		c2.setRadiusValue(8);

		c2.calculateCircumfrence();
		c2.viewCircumfrence();
		c2.calculateArea();
		c2.viewArea();




	}

}
