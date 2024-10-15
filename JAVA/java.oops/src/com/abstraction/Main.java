package com.abstraction;


abstract class Sample
{
	public abstract void text();
	
}

class child extends Sample
{

	
	public void text() 
	{
	 System.out.println("test override method of abstract class");	
	}
	
}
public class Main 
{
	public static void main(String[] args) {
	Sample s1; //--->Reference variable of sample class
	//new sample();---> object of abstract class is not possible
	child c= new child();
	c.text();
	}
}
