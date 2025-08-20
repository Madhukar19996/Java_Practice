package Assignment6;

public class Question8 {

	public static void main(String[] args) {


		int i ,j;
		int count =1;
		for(i=1;i<5;i++) {
			
			for(j=1;j<5;j++)
			{
				if(j<=i)
					//count++;
					System.out.print(count++ );
			}
			
			System.out.print("\n");
		}

	}

}
