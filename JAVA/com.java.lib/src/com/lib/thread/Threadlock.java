package com.lib.thread;

class threadone extends Thread
{
	String s1=null;
	String s2=null;
	threadone(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 start");
		System.out.println(" t1 waiting to lock s1");
		synchronized (s1)
		{
			System.out.println("t1 lock s1");	
			try {
				s1.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(" t1 waiting to lock s2 ");
			synchronized (s2) 
			{
				System.out.println("t1 lock s2");
			}
			System.out.println("t1 unlock s1");
			System.out.println("t1 unlock s2");
		}
	}
	
}
class threadtwo extends Thread
{
	String s1=null;
	String s2=null;
	threadtwo(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 start");
		System.out.println(" t2 waiting to lock s2");
		synchronized (s2)
		{
			System.out.println("t2 lock s2");	
			System.out.println(" t2 waiting to lock s1 ");
			synchronized (s1) 
			{
				s1.notify();
				System.out.println("t2 lock s1");
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
		}
	}
	
}

public class Threadlock 

{
	public static void main(String[] args) {
		
	String st1 = new String("hello");
	String st2 = new String("hi");
	threadone t1 = new threadone(st1, st2);
	threadtwo t2 = new threadtwo(st1, st2);
	t1.start();
	t2.start();
	
	}	
}
