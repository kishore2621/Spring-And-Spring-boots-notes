package com.shoping.payment;

import com.shopping.account.Account;
import com.shopping.account.Trannsaction;

public class Creditcard 
{
	int amount=30000;
	Account a2;
  public Creditcard(Account a2) {
		this.a2=a2;
	}

public void transfer ( int amt,Trannsaction t1) 
  {
	t1.deposit(amt, a2,amount);
  }
}
