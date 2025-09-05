package InterviewJavaProgram;

public class MutiDemensionArrayMax {

	public static void main(String[] args) {
	
		int arr[][]= {{2,6,8},{3,5,1},{7,9,4}};
		int max=arr[0][0];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
		}
		

		System.out.println(max);
		
	}

}
