package day19;



public class FinallyBlock {

	public static void main(String[] args) {
		
		String s="Madhukar Pandey";
		
		try 
		{
			System.out.println(s.length());
		}
		
		/*catch(NullPointerException e)
		{
			System.out.println("Exception Handled...");
		}
		finally
		{
			System.out.println("Entered into Finally Block...");
		}*/
		
		
		catch(ArithmeticException e )
		{
			System.out.println("Exception Handled...");
		}
		finally
		{
			System.out.println("Entered into Finally Block...");
		}
		
	}

}
