package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day10.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration 
		
		ArrayList mylist= new ArrayList();
		
		
		//List mylist=new ArrayList();
		
		//ArrayList <String> mylist= new ArrayList<String>();
		//ArrayList <Employee> mylist= new ArrayList<Employee>();
		
		
		//Adding Data into ArrayList
		
		mylist.add(100);
		mylist.add(12.5);
		mylist.add("Madhukar");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of the ArrayList 
		
		System.out.println("Size of the ArrayList :"+mylist.size()); //8
		
		//Printing ArrayList
		System.out.println("Printing data from ArrayList:"+ mylist); //[100, 12.5, Madhukar, A, true, 100, null, null]
		
		//Remove element from the ArrayList
		
		mylist.remove(5); //Here 5 is index of element
		
		System.out.println("After removing printing data from ArrayList:"+ mylist);//[100, 12.5, Madhukar, A, true, null, null]
		
		//Insert Element in the ArrayList
		
		mylist.add(3,"Pandey");
		System.out.println("After insersation printing data from ArrayList:"+ mylist);//[100, 12.5, Madhukar, Pandey, A, true, null, null]

		//Modify Element in the ArrayList (modify/replacement/change)
		mylist.set(2,"Pushkar");
		System.out.println("After modication printing data from ArrayList:"+ mylist);//[100, 12.5, Pushkar, Pandey, A, true, null, null]
		
		//Access specific element from ArrayList
		System.out.println(mylist.get(2)); //  here index is 2 // Pushkar 
		System.out.println("Access specific element printing data from ArrayList:"+ mylist);//Pushkar
		
		// Reading all the elements from ArrayList
		
		//Using normal for loop 
		
		/*for (int i=0; i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		//Using for ..each loop
		
		/*for (Object x:mylist)
		{
		 System.out.println(x);
		}
		*/
		
		//Using Iterator
		
		/*Iterator <Object>it=mylist.iterator();
		//System.out.println(it.next());
		
		
		 while(it.hasNext()) 
		{
		 System.out.println(it.next());
		}
		
		 //checking ArrayList is empty or not 
		 
		 System.out.println("Is ArrayList is empty ?"+ mylist.isEmpty());
		 */
		 //Remove multiple element randomly from ArrayList 
		 ArrayList mylist2=new ArrayList();
		 mylist2.add(100);
		 mylist2.add("Pushkar");
		 mylist.removeAll(mylist2);
		 System.out.println("After removing multiple elements:"+mylist);//[12.5, Pandey, A, true, null, null]
		 
		 //Remove all the elements/clear
		 mylist.clear();
		 System.out.println("Is ArrayList is empty ?"+ mylist.isEmpty()); // true
		
		
		
		
		
		
	}

}
