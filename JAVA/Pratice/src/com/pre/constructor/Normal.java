package com.pre.constructor;

public class Normal 
{
	String name ;
	int age = 30;// direct intilazation
	char grade;
	
	public Normal(String name, int age, char grade) {
		
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public static void main(String[] args) 
	{
		 Normal n1 = new Normal("kishore ", 21, 'd');// using constructor
		 	System.out.println(	 n1.name);
		 	
//		 Normal n2 = new Normal();
//		 n2.name="kishore"; // using object reference
	 
		
	}
	

}
