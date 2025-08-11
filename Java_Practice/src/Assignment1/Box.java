package Assignment1;

public class Box {
	
	
		
		int length, width, height;
		
	   void  setdemension (int x , int y , int z ) 
	   {
			 
		    length=x;
		    width=y;
		    height=z;
			 
		}
	   
	   void showdemsion()
	   {
		   System.out.println("Length :"+ length);
		   System.out.println("Width :"+ width);
		   System.out.println("Height :"+ height);
	   }
	   
	  
	public static void main (String[] args)
	{
		Box b=new Box();
		b.setdemension(10, 20, 30);
		b.showdemsion();
		b=new Box();
		b.showdemsion();
	}

}
