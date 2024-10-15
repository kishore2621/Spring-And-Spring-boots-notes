package com.map;

import java.util.HashMap;
import java.util.Set;

public class Hash 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		h1.put(1, "kishore");
		h1.put(2, "sumit");
		h1.put(5, "rahul");
		h1.put(6, "abc");
		h1.put(1, "kishor");
		System.out.println(h1);
		System.out.println(h1.containsKey(8));
		System.out.println(h1.containsValue("abc"));
		
	  Set<Integer> keys =h1.keySet();	
	  for (Integer key : keys )
	  {
		 System.out.println(h1.get(key));
	  }
	}

}
