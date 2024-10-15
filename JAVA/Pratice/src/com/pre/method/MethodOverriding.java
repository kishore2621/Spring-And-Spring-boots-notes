package com.pre.method;
 
interface bank
{
	public void intrest(int b );
	
}
class sbi implements bank
{
	public void intrest(int b )
	{
		int intr = b+(b*7 *100)/100;
		System.out.println(intr);
	}
}
class icic implements bank
{
	public void intrest(int b )
	{
		int intr = b+(b*8 *100)/100;
		System.out.println(intr);
	}
}

 public class MethodOverriding 
 {
	 public static void main(String[] args) {
		
			bank b= new sbi();
		 	b.intrest(200);
		 	
		 	bank b1= new icic();
		 	b1.intrest(200);
		 	
	}
}
