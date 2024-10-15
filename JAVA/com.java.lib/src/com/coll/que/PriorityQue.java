package com.coll.que;

import java.util.PriorityQueue;

public class PriorityQue 
{
	public static void main(String[] args) 
	{
	PriorityQueue<Integer>p1=new PriorityQueue<Integer>();
	p1.add(65);
	p1.add(2);
	p1.add(34);
	p1.add(5);
	p1.add(7);
	p1.add(2);
	System.out.println(p1);
	
	while(p1.size()!=0)
	{
		System.out.println(p1.poll());
		
	}
		
	}

}
