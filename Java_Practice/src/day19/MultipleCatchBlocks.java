package day19;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("===Program is started===");
        String s=null;
		try
		{
		System.out.println(s.length()); 
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled...");
		}
		
		
		
		/*catch(ArithmeticException e)
		{
			System.out.println("Handled Arithmetic Exception...");
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled NullPointerException...");
		}
		catch(NumberFormatException e)
		{
			System.out.println(" Handled Number format Exception..");
		}*/
		
		
		
		
		
		System.out.println("===Program is completed===");


	}

}
