package com.map;


import java.util.TreeMap;

class students1 implements Comparable<students1>
{
	String name;
	int id;
	students1(String n, int i)
	{
		this.name=n;
		this.id=i;
	}
	@Override
	public String toString()
	{
		return "name="+name+"id="+id;	
	}
	
	@Override
	public int compareTo(students1 o) {
		// TODO Auto-generated method stub
		return o.name.compareTo(this.name);
	}
	
	
}
public class Tree {
	public static void main(String[] args) 
	{
		
		TreeMap<students1, Integer> t1= new TreeMap<students1,Integer>();
		t1.put( new students1("sumit", 4),5);
		t1.put( new students1("abc", 5),7);
		t1.put( new students1("kishore", 7),9);
		t1.put( new students1("rahul", 9),10);
		t1.put( new students1("abc", 6),12);
		System.out.println(t1);
		
	}
}
