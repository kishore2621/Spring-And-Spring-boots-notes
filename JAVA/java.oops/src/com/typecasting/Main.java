package com.typecasting;
class A{

}
class B extends A{

}
class C extends A{

}
public class Main {
	public  void test(A a1) {
		System.out.println("A a1="+a1);
	}
	public  void test(B b1) {
		System.out.println("B b1="+b1);
	}
	public static void main(String[] args) {
		Main m1= new Main();
		m1.test(new A());
		m1.test(new B());
		m1.test(new C());
	}

}
