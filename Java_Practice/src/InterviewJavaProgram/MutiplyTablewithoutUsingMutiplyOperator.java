package InterviewJavaProgram;

public class MutiplyTablewithoutUsingMutiplyOperator {
	
	public static int  multiplyNum(int i, int j) {
		
		int res=0;
		int k=1;
		
		while(k<=j)
		{
			res=res+i;
			System.out.println(res);
			k++;
		}
		 return res;
		
	}
	

	public static void main(String[] args) {
		
		
		int res =multiplyNum(5,10);
		
		//System.out.println(res);
		
		

	}

}
