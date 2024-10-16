package com.inheritannce;

class A extends methodOverriding
{
	@Override	
	/* 
	 * it is a per  defined annotation in java 
	 * which is used to indicate the method is overridden or not
	 * if we mention @ override annotation it is called as override method
	*/
	public void text()
	{
		System.out.println("hello");
	}
	
}

/*note: constructor, static, private methods  cannot be overridden because we cannot achieve 
inheritance with them*/
public class methodOverriding  
{
	
	public void text()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		A a = new A();
		a.text();
		methodOverriding m = new methodOverriding();
		m.text();
	}
	
	
	
	
	
}


