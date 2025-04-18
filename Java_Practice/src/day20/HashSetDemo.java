package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration 
		HashSet myset=new HashSet();
		//Set myset=new HashSet();
		
		//HashSet<String>myset=new HashSet<String>();
		
		//Adding Elements into HashSet
		
		myset.add(100);
		myset.add(13.4);
		myset.add("Piyush");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing HashSet
		System.out.println(myset);//[null, A, 100, 13.4, Piyush, true]
		
		//Remove Specific element from HashSet
		
		myset.remove(13.4); //13.4 is value (not index)
		System.out.println("After removing:"+myset);//[null, A, 100, Piyush, true]
		
		//Inserting Element --Not Possible
		
		//Access specific element -Not Possible
		
		//Convert HashSet-->ArrayList
		ArrayList al=new ArrayList(myset);
		System.out.println(al);  //[null, A, 100, Piyush, true]
		
		//Size of the HashSet
		System.out.println("Size of the HshSet:"+myset.size()); //Size of the HshSet:5

		System.out.println(al.get(3));
		
		//Read all the elements using for..each 
		/*for(Object a:myset)
		{
			System.out.println(a);
		}
		*/
		
		//Using Iterator 
		Iterator<Object> it =myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Clearing all the elements in HashSet
		
		myset.clear();
		System.out.println("Is HashSet is empty ?"+ myset.isEmpty()); //true
		
		
		
		
		
		
		
		
		

	}

}
