package com.pre.constructor;

import java.util.Scanner;

class instagram
{
	private static instagram s1;
	String Email ;
	long mobileNo;
	String firstname;
	String lastname;
	String password;
	private instagram(String email, String firstname, String lastname, String password) {

		this.Email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	private instagram(Long mobileNo, String firstname, String lastname, String password) {

		this.mobileNo = mobileNo;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	public static   instagram getinstance(Long mobileNo, String firstname, String lastname, String password )
	{
		System.out.println("ok1");

		return  s1= new instagram( mobileNo,  firstname,  lastname,  password);
	}
	public static   instagram getinstance(String email, String firstname, String lastname, String password )
	{
			System.out.println("ok");
		return  s1= new instagram( email,  firstname,  lastname,  password);
		
	}


}

public class ConstructorOveloading 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your email or phonenumber");
	     String s= sc.next();
	     String firstname=sc.next();
	     String lastname= sc.next();
	     String password=sc.next();
	     long num=0;
	     
	     for(int i=0; i<=s.length()-1;i++)
	     {
	    	
	    	 if( i>=48 && i<=57)
		     {
		    	num =num+ (s.charAt(i)-48);
		     }
	     }
	     instagram.getinstance(s, firstname, lastname, password);
	     instagram.getinstance(num, firstname, lastname, password);
	     sc.close();
			
		
	}

}
