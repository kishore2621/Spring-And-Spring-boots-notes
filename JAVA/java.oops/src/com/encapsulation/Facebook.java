package com.encapsulation;

public class Facebook 
{
	public static void main(String[] args) 
	{
		User  kishore= new User();
		
		Service s1= new Service();
		s1.signup("abc", "123", kishore);
		s1.login("abc", "123", kishore);
	}

}
