package com.shoping.paymethod;

import java.util.Scanner;

import com.shopping.account.Account;
import com.shopping.account.Trannsaction;
import com.shoping.payment.Cashondelivery;
import com.shoping.payment.Creditcard;
import com.shoping.payment.Debitcard;
import com.shoping.upi.Gpay;
import com.shoping.upi.Ppay;
import com.shoping.upi.upi;

public class Userservice 
{ 
	Trannsaction t1;
	Account a2;
	public void order() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YOUR OPTION");
		System.out.println("1.DEBITCARD"+" "+"2.CREDITCARD"+" "+"3.UPI"+" "+"4.CASH ON DELIVERY");
		int a=s.nextInt();
		if(a==1) 
		{
			System.out.println("ENTER THE PRODUCT AMOUNT");
			int a1=s.nextInt();
			Debitcard d1=new Debitcard(a2);
			d1.transfer(a1, t1);
		}
		else if(a==2) 
		{
			System.out.println("ENTER THE PRODUCT AMOUNT");
			int a1=s.nextInt();
			Creditcard c1=new Creditcard(a2);
			c1.transfer(a1, t1);
			
		}
		else if(a==4) 
		{

			System.out.println("ENTER THE PRODUCT AMOUNT");
			int a1=s.nextInt();
			Cashondelivery  c1=new Cashondelivery ();
			c1.transfer(a1);
			
		}
		else if(a==3) 
		{
			System.out.println("ENTER THE PRODUCT AMOUNT");
			int a1=s.nextInt();
			System.out.println("GAPY OR PHONEPAY");
			String a3=s.nextLine();
			if(a3=="ppay") {
			upi u1=new Ppay ();
			u1.deposit(a1,t1);
			}
			else if(a3=="gpay") 
			{
				upi u1=new Gpay();
				u1.deposit(a1,t1);
			}
			
		}
		else 
		{
			System.out.println("INVALID OPERATION");
		}
		s.close();
	}
	
}
