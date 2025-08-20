package Assignment7;

public class Question1 {

	static class ComplexNumber {

		public int real, img;

		public void viewvalue(String sq) {


			System.out.println("Here is your "+sq+"complex Number "+real+"+"+img+"i");

		}


		public void setvalue(int a, int b) {

			real=a; 
			img=b;

		}
		
		
		public void Addvalue(ComplexNumber c,ComplexNumber d) {

			real=c.real+d.real;
			img=c.img+d.img;
			System.out.println("Here is your addition of complex number: "+real+"+"+img+"i");
		}
		
		public void Subvalue(  ComplexNumber c,ComplexNumber d) {

			real=c.real-d.real;
			img=c.img-d.img;
			System.out.println("Here is your subtraction of complex number: "+real+"+"+img+"i");
		}








	}




	public static void main(String[] args) {


		ComplexNumber obj1 = new ComplexNumber();
		ComplexNumber obj2= new ComplexNumber();
		ComplexNumber obj3= new ComplexNumber();
		ComplexNumber obj4= new ComplexNumber();
		
		
		
		obj1.setvalue(3,4);
		obj2.setvalue(2,2);
		obj1.viewvalue("first");
		obj2.viewvalue("second");
		obj3.Addvalue(obj1, obj2);
		obj4.Subvalue(obj1, obj2);
		
		

		



	}



}

