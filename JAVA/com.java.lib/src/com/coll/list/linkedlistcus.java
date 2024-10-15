package com.coll.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class user  implements Comparable<user>
{
	String name;
	int id;
	int rank;
	public user(String name, int id, int rank) {
	
		this.name = name;
		this.id = id;
		this.rank = rank;
	}
	@Override
	public int compareTo(user o) {
		// TODO Auto-generated method stub
		return o.name.length()-this.name.length();
	}
	@Override
	public String toString()
	{
		return "name ="+name +"id="+id +"rank="+rank;
		
	}
	
}
class user2 implements Comparator<user>
{

	@Override
	public int compare(user o1, user o2) {
		
		return o1.id-o2.id;
	}
	
}


public class linkedlistcus {
	
	public static void main(String[] args) 
	{
	
	LinkedList<user> l1=new LinkedList<user>();
	user u1= new user("abc", 2, 33);
	user u2= new user("bc", 5, 36);
	user u3= new user("abcd", 1, 47);
	user u4= new user("abcef", 4, 30);
	l1.add(u1);
	l1.add(u2);
	l1.add(u3);
	l1.add(u4);
	Collections.sort(l1);
	Iterator<user> i=l1.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
		System.out.println("___________________________________");
		
		LinkedList<user> l2=new LinkedList<user>();
		user s1= new user("abc", 2, 33);
		user s2= new user("bc", 5, 36);
		user s3= new user("abcd", 1, 47);
		user s4= new user("abcef", 4, 30);
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		l2.add(s4);
	Collections.sort(l2, new user2());
	
	while(l2.size()!=0)
	{
		System.out.println(l2.poll());
	}
	}
}
