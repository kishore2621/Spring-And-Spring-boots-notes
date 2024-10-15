package com.lib.thread;

class mythread extends Thread
{
	String s1=null;
	String s2=null;
	public mythread(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 start");
		synchronized (s1) 
		{
			System.out.println("t1 start lock s1");
			try {
				s1.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for(int i=1;i<=3;i++)
			{
				System.out.println(i);
			}
			synchronized (s2) 
			{
			System.out.println("t1 start s2");
			for(int i=3;i<=6;i++)
			{
				System.out.println(i);
			}
			}
			System.out.println("end");
		}
	}
	
}
class mythreadone extends Thread
{
	String s1=null;
	String s2=null;
	public mythreadone(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 start");
		synchronized (s2) 
		{
			System.out.println("t2 start lock s2");
//		s2.notify();
			for(int i=6;i<=9;i++)
			{
				System.out.println(i);
			}
			synchronized (s1) 
			{
				s2.notify();
			System.out.println("t2 start s1");
			for(int i=10;i<=13;i++)
			{
				System.out.println(i);
			}
			}
			System.out.println("end");
		}
	}
	
}
public class Lock 
{
	public static void main(String[] args) 
	{
		String st1=new String("hello");
		String st2=new String("hi");
		mythread t1=new mythread(st1, st2);
		mythreadone t2=new mythreadone(st1, st2);
		t1.start();
		t2.start();
		
	}

}
