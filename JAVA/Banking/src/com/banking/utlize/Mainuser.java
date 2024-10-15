package com.banking.utlize;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;
import com.banking.implement.user;
import com.banking.service.Userservice;
public class Mainuser 
{
	user u;
	public static void main(String[] args) 
	
	{  
		Account a1=new Account();
		Transaction t1=new Transaction();
		Userservice us=new Userservice();
		Scanner s =new Scanner(System.in);
		System.out.println("WELECOM TO BANK");
		System.out.println("ENTER YOUR CHOICE");
		int a=s.nextInt();
		if(a==1) 
		{
			System.out.println("enter your pin");
		int pin =s.nextInt();
		  if(pin ==1111) {
			user u=us.login(pin,a1);
			System.out.println("Enter amount");
			int a2=s.nextInt();
			u.transfer (a2, t1);
		  }
		  if(pin==2222) 
		  {
			  user u=us.login(pin,a1);
				System.out.println("Enter amount");
				int a2=s.nextInt();
				u.transfer (a2, t1);
			  
		  }
			 s.close();
		}
		
	}
}
