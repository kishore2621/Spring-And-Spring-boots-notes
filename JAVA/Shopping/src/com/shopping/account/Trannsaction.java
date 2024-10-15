package com.shopping.account;

public class Trannsaction 
{
	public void deposit(int shp,Account a1) 
	{
		a1.setAmt(a1.getAmt()-shp);
		System.out.println("DEBITED AMOUNT SUCESSFUL");
		
	}
	public void deposit(int amt ,Account a1,int sop) 
	{
		a1.setAmt(amt);
		a1.setAmt(a1.getAmt()-sop);
		a1.getAmt();
	}
}
