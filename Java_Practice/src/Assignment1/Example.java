package Assignment1;


	
  class BOX {
		

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
	}

	 class Example {

		public static void main(String[] args) {
			
			BOX b = new BOX();
			b.setdemension(10, 20, 30);
			b.showdemsion();
			b=new BOX();
			b.showdemsion();
		}
}
