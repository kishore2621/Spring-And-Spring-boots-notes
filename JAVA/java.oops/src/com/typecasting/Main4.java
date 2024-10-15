package com.typecasting;
class s
{
	public void test() 
	{
		System.out.println("HELLO"); 
	}
}
class a1 extends s
{
	@Override
	public void test() 
	{
		System.out.println("java"); 
	}
}

public class Main4
{
	public static void main(String[] args) {
		s s1= new a1();
		s1.test();
	}

}
