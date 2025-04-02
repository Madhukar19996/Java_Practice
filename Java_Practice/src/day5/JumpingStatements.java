package day5;

public class JumpingStatements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*for (int i=1;i<=10;i++)
		{  
			if(i==5) 
			{
			   break;	
			}
			System.out.println(i);
		}*/
		
		/*
		for (int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		*/
		
		
		for (int i=1;i<=10;i++)
		{
			if(i==3 || i==5 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
