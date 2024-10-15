package com.coll.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class player implements Comparable<player>
{
	
	String name;
	int id;
	int rank;
	public player(String name, int id, int rank) {
		
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
	
	
	@Override
	public String toString() {
		
		return "playername="+name+" " +"playerid="+id +" "+"player rank="+rank;
	}


	@Override
	public int compareTo(player ik) {
		
		return ik.rank-this.rank;
	}
	
}
class user3 implements Comparator<player>
{

	@Override
	public int compare(player o1, player o2) {
		
		return  o2.id-o1.id;
	}
	
}

public class Arrayscus 
{
	public static void main(String[] args) 
	{
		player p1=new player("abc", 12, 2);
		   player p2=new player("def", 11, 3);
		   player p3=new player("che", 14, 1);
		   
		ArrayList<player> a1= new ArrayList<player>();
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
//	Collections.sort(a1);
	System.out.println(a1);
	Iterator<player> il = a1.iterator();
			while(il.hasNext())
			{
				System.out.println(il.next());
			}
			Collections.sort(a1, new user3());
			while(il.hasNext())
			{
				System.out.println(il.next());
			}
	}

}
