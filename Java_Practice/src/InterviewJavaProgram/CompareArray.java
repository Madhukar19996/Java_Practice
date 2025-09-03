package InterviewJavaProgram;

import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		
		
		int a[]= {3 ,5, 8 ,2 ,9};
		int b[]= {1,3,5,2,4};
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]==b[i])
			{
				al.add(a[i]);
			}
			
		}
		
		Object []c =al.toArray();
		
		for( Object obj:c)
		{
			System.out.println(obj);
		}

	}

}
