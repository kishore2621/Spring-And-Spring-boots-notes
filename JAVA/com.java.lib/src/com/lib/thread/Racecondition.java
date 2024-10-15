package com.lib.thread;
class Naturalnumber 
{
	
	public  void print ( int n)
	{
		
		for (int i=0;i<=n;i++)
		{
			System.out.print(i+" ");
		}
	}
	  public  void print1 ()
	{
		for (int i=3;i<=6;i++)
		{
		
			System.out.print(i+" ");
		}
	}
}
class person1 extends Thread
{
	Naturalnumber n1;

	person1(Naturalnumber n1)
	{
		this.n1=n1;
	}
	@Override
	public void run()
	{
		n1.print(3);
		n1.print1();
	}
}
class person2 extends Thread
{
	Naturalnumber n1;
	person2(Naturalnumber n2)
	{
		this.n1=n2;
	}
	@Override
	public void run()
	{
		n1.print1();
		n1.print(3);
	}
}

public class Racecondition 
{
	public static void main(String[] args) {
		
	
	Naturalnumber n1= new Naturalnumber();
	person1 p1=new person1(n1);
    p1.start();
	person2 p2= new person2(n1);
	p2.start();
	}
	

}
