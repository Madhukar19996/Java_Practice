package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	{
		// Single Dimensional Array 
		
		//1) Declaring array
		
		//Appraoch1 : Declaration 
		/* int a[]= new int[5];
		 
		 // Adding values into the array
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;*/
		
		
		// Approach2 : Declaration + adding values into the array.
		
		int a[]= {10,20,30,40,50};
		// System.out.println(a); // incorrect ,should not use 
		
		// Find size of the array 
		System.out.println("Size of the Array is:"+ a.length);	// Return Length(Size) of the the array 5
		
		// Reading the single value from the array.
		
		//System.out.println(a[3]); // 40
		//System.out.println(a[0]); // 10 
		
		// Reading the multiple value from the array.
		// System.out.println(Arrays.toString(a)); // [10, 20, 30, 40, 50]
		
		// Normal for loop 
		
		
		/*for(int i=0; i<=4; i++)
		{
			System.out.println(a[i]); // 10
		}*/
		
		// enhanced for loop / for each loop 
		
		for (int x:a )
		{
		System.out.println(x);
		}
		
		
		
		

	}

}
