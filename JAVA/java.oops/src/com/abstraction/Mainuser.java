package com.abstraction;

interface hotel{
	public void orderfood();
}
class veghotel implements hotel{
	public void orderfood() {
		System.out.println("veg food is order");
	}
}
class nonveghotel implements hotel{
	public void orderfood() {
		System.out.println(" non veg food is order");
	}
}
class selecthotel{
	hotel h1;
	public hotel select(String colour) {
		if(colour=="green") 
		{
			h1=new veghotel();
			return h1;
		}
		else
		{
			h1=new nonveghotel();
			return h1;
		}
	}
}

public class Mainuser {
	public static void main(String[] args) {
		selecthotel s1=new selecthotel();
		hotel h1= s1.select("green");
		h1.orderfood();
	}

}
