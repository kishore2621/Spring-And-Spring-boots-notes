package com.shoping.payment;

import com.shopping.account.Account;
import com.shopping.account.Trannsaction;

public class Debitcard 
{
	Account a1;
	public  Debitcard (Account a1)
	{
		this.a1=a1;
	}

	public void transfer (int amt,Trannsaction t1) 
	{
		t1.deposit(amt, a1);
	}
}
