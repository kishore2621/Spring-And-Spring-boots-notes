package com.lib.thread;

class test{
	
	public  void print()
	{ int c=0;
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
			c++
			;
			
			
		}
		System.out.println(c);
		
	}
}
class thread2 extends Thread{
      test t;
		thread2(test t)
		{
			this.t=t;
		}
		@Override
		public void run()
		{
			t.print();
		}
		
}
class thread1 extends Thread{
    test t;
		thread1(test t)
		{
			this.t=t;
		}
		@Override
		public void run()
		{
			t.print();
		}
		
}
public class Sample{
	
		public static void main(String[] args) 
		{
			test t =new test();
			thread2 t2 = new thread2(t);
			t2.start();
			thread1 t1 = new thread1(t);
			t1.start();
		}
}
