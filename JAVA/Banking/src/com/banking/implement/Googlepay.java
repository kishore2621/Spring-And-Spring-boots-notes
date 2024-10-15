package com.banking.implement;

import java.util.Scanner;

import com.banking.account.Account;
import com.banking.account.Transaction;

public class Googlepay implements user {
 Account a1;
 
 	
	public Googlepay(Account a1) {
	 
		this.a1=a1;
}


	@Override
	public void transfer(double amt, Transaction t1) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("ENTER THE OPTION 1,DEPOSIT 2,WITHDRAW");
		 int option=s.nextInt();
		if(option==1) 
		{
				t1.deposit(amt, a1);
				t1.checkbalance(a1);
		}
		else if(option==2)
		{
			t1.withdraw(amt, a1);
			t1.checkbalance(a1);
	    }else {
	    	System.out.println("inavalid input");
	    }
		s.close();
		
	}


	}


