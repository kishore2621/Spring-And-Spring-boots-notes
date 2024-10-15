package com.inheritannce;

class sample1{
	public sample1( int a) {
		super();
		System.out.println("sample class");
	}
}

class demo1 extends sample1{
	public demo1(int a){
		super(a);
		System.out.println("demo class");
	}
}
public class superstamet {
public static void main(String[] args) {
	demo1 d1= new demo1(45);
      
	
}
}