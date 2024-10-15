package com.inheritannce;

class account{
	public long accno;
	public double bal;
	public String owner;
	
	public void deposit(int amt) {
		if(amt>0) {
			bal=bal+amt;
			System.out.println("deposit sucessful");
		}
		else {
			System.out.println("ivalid amount");

		}
	}
	public void withdraw(int amt) {
		if (amt<bal) {
			bal=bal-amt;
			System.out.println("withdraw sucessful");
		}
		else {
			System.out.println("isufficent balance");
		}
	}
}
class saving extends account 
{ 
	public double roi = 0.05;
	public void  calculator()
	{
		bal=bal+ bal*roi;	
		System.out.println(bal);
	}
}
class current extends account{
	double minbal=3000;
	public void min() {
		System.out.println(minbal);
	}
}

public class Multiple {
	public static void main(String[] args) {
		saving s1 = new saving();
		s1.deposit(2000);
		s1.calculator();
		current c1= new current();
		c1.deposit(3000);
	}

}
