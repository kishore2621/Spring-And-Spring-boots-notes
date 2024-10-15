package com.encapsulation;

public class Service 
{
	public void signup(String email,String pass,User l1)
	{
		l1.setemail(email);
		l1.setPassword(pass);
	}
	public void login (String email,String pass,User l1)
	{
		if(l1.getemail()==email && l1.getPassword()==pass)
		{
			System.out.println("login sucessfull");
		}
		else
		{
			System.out.println("Invalid password or email");
		}
	}

}
