package com.pre.method;

class calculator 
{
	public void add(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
	}
	public void add(double a, double b)
	{
		double sum =a+b;
		System.out.println(sum);
	}
	public void add(float a, float b)
	{
		float sum =a+b;
		System.out.println(sum);
	}
}


public class MdethodOverloading 
{

	public static void main(String[] args)
	{
		calculator c1 = new calculator();
		c1.add(2.0d, 35.6);
	}
	

}
