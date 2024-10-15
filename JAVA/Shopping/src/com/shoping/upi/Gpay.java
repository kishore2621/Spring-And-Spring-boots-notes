package com.shoping.upi;

import com.shopping.account.Account;
import com.shopping.account.Trannsaction;

public  class Gpay implements upi {
	Account a1;
	
	@Override
	public void deposit(int shp,Trannsaction t1) 
	{
		t1.deposit(shp, a1);
	}

}
