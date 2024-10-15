package com.typecasting;


	class user
	{
		
	}
	class customer extends user
	{
		public void buyproduct()
		{
			System.out.println("customer can buy");
		}
		public void cancelproduct() 
		{
		System.out.println("customer can cancel");	
		}
		
	}
	class admin extends user
	{
		public void addproduct()
		{
			System.out.println("admin can add");
		}
		public void removeproduct() 
		{
		System.out.println("admin can remove");	
		}
		
	}
	class loginpage
	{
		public void login(user u1) 
		{
			if(u1 instanceof customer) 
			{
				customer c1=(customer)u1;
				c1.buyproduct();
				c1.cancelproduct();
			}
			else 
			{
				admin a1=(admin)u1;
				a1.addproduct();
				a1.removeproduct();
			}
		}
		
	}
	public class Instancekey {
		public static void main(String[] args) {
			loginpage lg=new loginpage();
			lg.login(new customer());
			lg.login(new admin());
		}
		
}
