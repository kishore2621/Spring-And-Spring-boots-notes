package com.lib.exception;


public class UnCheckedexception 
{
   public static void add(int a,int b)
   {
		int sum =a+b;
		   System.out.println(sum);
   }
   public static void sub(int a,int b)
   {
		int sum =a-b;
		   System.out.println(sum);
   }
   public static void mul(int a,int b)
   {
		int sum =a*b;
		   System.out.println(sum);
   }
   public static void div(int a,int b)
   {
		    int sum =a/b;   
		   System.out.println(sum);
   }
   public static void main(String[] args) 
   {
	div(50,0);
   }
}
