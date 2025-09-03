package InterviewJavaProgram;

public class SumofElements {
	
   
	
	
	
	 public static int ArraySum(int a[]) {
		 
		 int sum=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 
		 return sum;
	 }
	

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,9};
		
		
		int sum=ArraySum(a);
		//System.out.println(ArraySum(a));
		System.out.println(sum);
		

	}

}
