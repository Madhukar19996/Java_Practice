package javaassignment;

import java.util.Arrays;

public class SortingOfElementInArray {

	public static void main(String[] args) {
		// Sorting Of Element In Array
		
		int a[]= {1,9,5,7,4,3};
		System.out.println("Before Sorting "+Arrays.toString(a)); // [1, 9, 5, 7, 4, 3]
		Arrays.sort(a); // This will sort elements
		System.out.println("After sorting"+Arrays.toString(a));  // [1, 3, 4, 5, 7, 9]
		
		
		//Sorting Strings
		
		String a1[]= {"S","B","G","A","C"};
		System.out.println("Before Sorting "+Arrays.toString(a1)); // [S, B, G, A, C]
		Arrays.sort(a1); // This will sort elements
		System.out.println("After sorting"+Arrays.toString(a1));  // [A, B, C, G, S]
		


	}

}
