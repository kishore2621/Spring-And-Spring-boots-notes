package com.inheritannce;
class Sample{
	final int v1=0;
	String str;
	public void test() {
		System.out.println("test of sample class");
	}
}
class demo extends Sample{
	double z1;
	public void display() {
		System.out.println("display of demo class");
	}
}

public class Mainsingle {
	public static void main(String[] args) {
		demo d1= new demo();
		d1.test();
		d1.display();
		System.out.println(d1.str);
		System.out.println(d1.v1);
		System.out.println(d1.z1);
	}

}
