package com.shopping.utlize;

import java.util.Scanner;

import com.shopinng.Shoping;

public class Mainuser 
{
	public static void main(String[] args) 
	{ 
		Shoping s1= new Shoping();
		Scanner s=new Scanner(System.in);
		System.out.println("WELECOME TO SHOPPING");
		System.out.println("SEARCH YOUR PRODUCT");
		String na=s.nextLine();
		s1.product(na);
		s.close();

	}

}
