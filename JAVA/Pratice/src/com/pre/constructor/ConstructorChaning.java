package com.pre.constructor;

class student
{
	String name;
	int age;
	student(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
}

public class ConstructorChaning  extends student
{

	ConstructorChaning(String name, int age) {
		
		super(name, age);
		
	}
	public static void main(String[] args) 
	{
		ConstructorChaning c1= new ConstructorChaning("kishore",21);
		System.out.println(c1.name);;
	}
	

}
