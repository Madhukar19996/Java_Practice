package InterviewJavaProgram;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		int a =0;
		int b =1;
		int sum=0;
		
		for(int i=0;i<9;i++) {
			
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}
		

	}

}
