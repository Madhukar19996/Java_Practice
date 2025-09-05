package InterviewJavaProgram;

public class MutidemsentionArray {

	public static void main(String[] args) {
		
		
		int abc [][]= {{3,6,8},{2,4,7},{1,2,9}};
		int min=abc[0][0];
		
		for(int i=0; i<abc.length ;i++)
		{
			for(int j=0;j<abc.length;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
			
			
		}
		
		System.out.println(min);
		

	}

}
