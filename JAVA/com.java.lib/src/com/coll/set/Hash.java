package com.coll.set;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash {
	public static void main(String[] args) 
	{
		HashSet<String> h1 = new HashSet<String>();
		h1.add("hij");
		h1.add("kishore");
		h1.add("abc");
		h1.add("def");
		h1.add("kishore");
		h1.add("sumit");
		System.out.println(h1);
		//converting to array list
		ArrayList<String> a1= new ArrayList<String>(h1);
		System.out.println(a1.get(2));
		
		
	}

}
