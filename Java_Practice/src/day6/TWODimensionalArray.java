package day6;

public class TWODimensionalArray {

	public static void main(String[] args) 
	{
		// TWO Dimensional Array
		
		// Declaration 
		
		// Approach1
		
		/*int a[][]= new int[3][3]; // declaration 
		 a[0][0]=100;
		 a[0][1]=200;
		 
		 a[1][1]=300;
		 a[1][1]=400;
		 
		 a[2][0]=500;
		 a[2][1]=600;*/
		
		// Aprroach2:  declaration + adding values into array
		
		int a[][]= { 
				{100,200},
				{300,400},
				{500,600}
				};
		
		//3) Find size of the array 
		System.out.println(a.length); // returns numbers of rows 
		System.out.println(a[0].length); // returns numbers of column in specific row 
		
		//4) Read specific value from 2D array
		System.out.println(a[1][1]); // 400
		
		
		//5) Read all data from 2D array.
		
		/*for(int i=0;i<=2;i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.println(a[i][j]);
			}
		}*/
		
		//6) If we don't know how many rows and columns in a array 
		/*for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0; j<=a[i].length-1; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/

		//7) Enhanced For Loop 
		
		for (int arr[]:a)
		{
			for(int x: arr)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
	}

}
