package com.banking.account;

public class Transaction 
{
 public void deposit(double amt,Account a1) 
 {
	 if(amt>0) 
	 {
		 double  b= a1.getBal()+amt;
		 a1.setBal(b);
	 }
 }
 public void withdraw(double amt,Account a1) 
 {
	 if(amt>0&&amt>=a1.getBal()) 
	 {
		double  b= a1.getBal()-amt;
		 a1.setBal(b);
	 }
 }
 public void checkbalance(Account a1) 
 {
	System.out.println( a1.getBal());
 }
 
}
