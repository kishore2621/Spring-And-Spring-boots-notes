package com.typecasting;


public class Passingvalue 
{

	public static int test(int a)
	{
		return a;
	}
	
	public static void main(String[] args) {
	System.out.println(	test(5));
		int i= test('A');
		System.out.println(i);
	}

}
