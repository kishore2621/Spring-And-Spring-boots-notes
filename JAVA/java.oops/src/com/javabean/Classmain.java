package com.javabean;
import java.util.Scanner;
public class Classmain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Account a=new Account();
		service se= new service();
		System.out.println("1.create account" +" "+"2.setpin "+""+"3.transtation" +" "+ "3.check balance");
		int choise = s.nextInt();
		switch(choise) {

		case 1: 
			System.out.println("enter name ");s.next();
			String n =s.nextLine();
			System.out.println("enter phone no");;
			long ph=s.nextLong();
			System.out.println("enter acc no");
			long acc = s.nextLong();
			se.details(n,ph , acc, a);
			 System.out.println (" my phone="+a.getPhoneno() );
				System.out.println(a.getName());break;
			
	case 2:
			System.out.println("enter pin number");
			int pin =s.nextInt();
			se.pin(pin, a);
		case 3:
			System.out.println("1.DEPOSIT"+" "+"2.WITHDRAW"+" "+"3.CHECK BALANCE");
			int option = s.nextInt();
			switch(option) {
			case 1:
				System.out.println("ENTER YOUR AMMOUNT");
				int am =s.nextInt();
				System.out.println("enter your pin no");
				int pi=s.nextInt();
				se.Deposit(am, pi, a);
			case 2:
				System.out.println("ENTER YOUR AMMOUNT");
				int k =s.nextInt();
				System.out.println("enter your pin no"); 
				int p=s.nextInt();
				se.withdraw(k, p, a);
			}
		} 	
		s.close();
	} 
		} 
