package com.javabean;

public class service {
	public void details (String n,long ph, long acc,Account a ) {
		a.setName(n);
		a.setPhoneno(ph);
		a.setAccno(acc);


	}
	public void pin (int p, Account a) {
		
			if(p>1000 && p<9999) {
				a.setPin(p);
				System.out.println("SET PIN SUCESSFULLY");
			}else {
				System.out.println("invalid pin ");}
		
		}
	public void Deposit (int am, int pin ,Account a) {
		
		if (a.getPin()==pin) {
			if (am>0) {
			double bal = a.getBalance() + am;
			a.setBalance(bal);
			System.out.println("DEPOSIT SUCESSFUL");
		}else {
			System.out.println("invalid ammount");
		}}
		else {
			System.out.println("invalid password");
		}
	}
	public void withdraw (int am, int pin ,Account a) {
		if (a.getPin()==pin) {
			double bal=a.getBalance()-am;
			a.setBalance(bal);
			System.out.println("WITHDRAW SUCESSFULLY");
		}
		else {
			System.out.println("invalid pin");
		}
	}
	public void changepno(long ph , int pin , Account a) {
		if (a.getPin()==pin) {
			a.setPhoneno(ph);
			System.out.println("CHANGE PIN SUCESSFULLY");
		}
		else {
			System.out.println(" invalid pin");
		}
	}
	public void checkbal(  int pin , Account a) {
		if (a.getPin()==pin) {
			System.out.println(a.getBalance());
		}else {
			System.out.println(" invalid pin");
		}
	}


}
