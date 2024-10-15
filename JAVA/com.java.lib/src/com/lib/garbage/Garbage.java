package com.lib.garbage;

public class Garbage {
	
	
	@Override
	protected void finalize()  {
		// TODO Auto-generated method stub
		System.out.println(" clean the memory space");
	}

	public static void main(String[] args) 
	{
		Garbage g1 = new Garbage();
		g1=null;
		System.gc();
		
	}

}
