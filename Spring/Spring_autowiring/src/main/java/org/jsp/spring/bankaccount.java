package org.jsp.spring;

public class bankaccount 
{
	private double balance;

	
	public void display()
	{
		System.out.println("your balance is :"+ balance);
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
