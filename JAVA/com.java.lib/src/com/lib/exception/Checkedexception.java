package com.lib.exception;

//class studentmarks extends Exception
//{
//	studentmarks(String msg)
//	{
//		super(msg);
//	}
//	
//}

public class Checkedexception 
{
	public static void marks(int n) throws Exception 
	{
		if(n>=35)
		{
			System.out.println("pass");
		}
		
		else {
		throw new Exception();
		}
	}
	public static void main(String[] args) throws Exception 
	{
		marks(23);
	}

}
