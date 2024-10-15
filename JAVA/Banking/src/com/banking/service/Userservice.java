package com.banking.service;
import com.banking.account.Account;
import com.banking.implement.Googlepay;
import com.banking.implement.Phonepay;
import com.banking.implement.user;

public class Userservice 
{
 user u1;

 
 public user login(int pin, Account a1 ) 
 {
	 if(pin==1111) 
	 {
		 u1=new Phonepay(a1 );
		 return u1;
	 }
	 else if(pin==2222) 
	 {
		 u1=new Googlepay(a1);
		 return u1;
	 }
	 else 
	 {
		 System.out.println("INVALID OPERATION");
		 return u1;
	 }
 }
}
