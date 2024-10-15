package com.coll.list;


import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

class players implements Comparable <players> 
{
	
	String name;
	int id;
	int rank;
	public players(String name, int id, int rank) {
		
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
	
	
	@Override
	public String toString() {
		
		return "playername="+name+" " +"playerid="+id +" "+"player rank="+rank;
	}


	@Override
	public int compareTo(players ik) {
		
		return this.id-ik.id;
	}


	
	
}

public class Vectorlis 
{
	public static void main(String[] args) {
		
   players p1=new players("abc", 12, 2);
   players p2=new players("def", 11, 3);
   players p3=new players("che", 14, 1);
    Vector<players> v1= new Vector<players>();   
    v1.add(p1);
    v1.add(p2);
    v1.add(p3);
    System.out.println(v1);
//	v1.forEach(Obj->System.out.println(Obj));
	Iterator<players> il=v1.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	Collections.sort(v1);
	
	
	v1.forEach(Obj->System.out.println(Obj));
	

	}
   
  
   

}
