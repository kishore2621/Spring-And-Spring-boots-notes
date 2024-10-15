package com.map;


import java.util.LinkedHashMap;
import java.util.Set;

class students
{
	String name;
	int id;
	students(String n, int i)
	{
		this.name=n;
		this.id=i;
	}
	@Override
	public String toString()
	{
		return "name="+name+"id="+id;	
	}
}
public class Linnked {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, students> l2= new LinkedHashMap<Integer, students>();
		l2.put(5, new students("sumit", 4));
		l2.put(4, new students("abc", 5));
		l2.put(2, new students("kishore", 7));
		l2.put(6, new students("rahul", 9));
		l2.put(4, new students("abc", 6));
		
		System.out.println(l2);
		
		Set<Integer> keys =l2.keySet();	
		  for (Integer key : keys )
		  {
			 System.out.println(l2.get(key));
		  }
	}
	


}
