package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration
		HashMap <Integer,String>hm=new HashMap<Integer,String>();
		//HashMap hm=new HashMap();
		//Map hm=new HashMap();
		
		//Adding pairs in HashMap
		
		hm.put(101,"Madhukar");
		hm.put(102,"Ashish");
		hm.put(103,"Hamitha");
		hm.put(104,"Mushkan");
		hm.put(102,"Ankita");
		
		System.out.println(hm); //{101=Madhukar, 102=Ankita, 103=Hamita, 104=Mushkan}
		
		//Size of the HashMap
		System.out.println("Size of the HashMap:"+hm.size()); //Size of the HashMap:4
		
		//Removing one pair from HashMap
		
		hm.remove(104); // 104 is the key of the pair
		System.out.println("After removing pair:"+hm);  //After removing pair:{101=Madhukar, 102=Ankita, 103=Hamita}
		
		//Access Value of the key
		System.out.println(hm.get(103)); // 103 is the key //Hamitha
		
		//Get all the keys from the HashMap
		
		System.out.println(hm.keySet());  //[101, 102, 103]
		System.out.println(hm.values());  //[Madhukar, Ankita, Hamitha]
		System.out.println(hm.entrySet());//[101=Madhukar, 102=Ankita, 103=Hamitha]
		
		//Reading data from HashMap
		//Using for..each
		
		/*
		 for(int k: hm.keySet())
		 
		{
			System.out.println(k+"  "+hm.get(k));
		}
		*/
		
		//Using Iterator 
		 Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		 while(it.hasNext())
		 {
			 Entry<Integer,String> entry =it.next();
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 }
		 
		 //Clear Every element from HashMap 
		 hm.clear();
		 System.out.println("Is HashMap is empty ?"+hm.isEmpty()); //Is HashMap is empty ?true

		

	}

}
