package Assignment6;

public  class Question7 {

	public static void main(String[] args) {


		int i, j;
		char c ='A';

		for(i=1;i<=5;i++)
		{
			 c ='A';
			for(j=1;j<=5;j++)

				if(j>=i)
				{
					System.out.print(c++);
				}
				else
				{
					System.out.print(" ");
				}
			System.out.print("\n");

		}

	}

}
