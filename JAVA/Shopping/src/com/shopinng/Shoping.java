package com.shopinng;

import com.shoping.paymethod.Userservice;

public class Shoping
{
	Userservice u1;
String []product;
 public  void product( String na) 
 {
	String product[]= { "Phone" ,"laptop","perfume","watch"};
	for(int i=0;i<product.length-1;i++) 
	{
		System.out.println(product[i]);
		
	}
	for(int i=0;i<product.length-1;i++) 
	{
		if(product[i].equalsIgnoreCase(na)) 
		{
			u1=new Userservice();
			u1.order();
		}
		
	}
	System.out.println("THIS PRODUCT IS NOT AVALABLE ");
 }
 //search
  
 
}
