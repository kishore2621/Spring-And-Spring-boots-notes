package com.typecasting;
class e
{

}
class f extends e
{
	public e test(e e1) 
	{
		return e1;
	}
}

public class Passingobject 
{
	public static void main(String[] args) 
	{ f f1= new f();
	f f2=(f)f1.test(new f());//downcasting
	e e1 = f1.test(new e());//upcasting
	e e2=f1.test(new e());

	System.out.println(f2);
	System.out.println(e1);
	System.out.println(e2);

	}


}
