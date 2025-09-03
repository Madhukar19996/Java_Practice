package InterviewJavaProgram;


public class DifferenceBetweenAdjecentIndexInArray {
	
	

	public static void main(String[] args) {
	  
		int b[]= {5,8,12,17,19};
        int  diff=0;
		
		for(int i=0; i<b.length-1;i++) 
		{
			
			if(b[i+1] - b[i]>diff) 
			{
				
				diff=b[i+1] - b[i];
				
			}
			
		}
		
		System.out.println("Highest adjacent index value difference is :"+diff);

	}
	
	

}
