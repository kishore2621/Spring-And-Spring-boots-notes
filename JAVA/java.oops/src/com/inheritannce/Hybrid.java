package com.inheritannce;
import java.util.Scanner;

class flipkartorder{

	public void order() {
		System.out.println("ORDER IS PLACED");
	}
	public void cart() {
		System.out.println("CART IS SUCESSFULL");
	}

}
 class name {
	public boolean mainback() {
		System.out.println("go to main page");
		return true;
	}
	
}
class fashion extends flipkartorder{
	public void men() {
		System.out.println("1.order 2.ADD TO CART 3.CANCELED 4.back");
		Scanner s= new Scanner(System.in);
		char a=s.nextLine().charAt(0);
		if(a=='B'||a=='b') {
			order();
		}
		else if(a=='A'|| a=='a') {
			cart();
		}
		else if(a=='C'||a=='c') {
			System.out.println("PRODUCT IS CANCELLED");
		}else if(a== 'B' ||a=='b'){
			fashionbrand f1=new fashionbrand();
			f1.back();
		}
		else {
			men();
		}
		s.close();
	}
	public void women() {
		System.out.println("1.order 2.ADD TO CART 3.CANCELED 4.back");
		Scanner s= new Scanner(System.in);
		
		char a=s.nextLine().charAt(0);
		if(a=='O'||a=='o') {
			order();
		}
		else if(a=='A'|| a=='a') {
			cart();
		}
		else if(a=='C'||a=='c') {
			System.out.println("PRODUCT IS CANCELLED");
		}else if(a== 'B' ||a=='b'){
			fashionbrand f1=new fashionbrand();
			f1.back();
		}
		else {
			women();
		}s.close();
	}

}

 class fashionbrand extends fashion{
	public void  puma() {

		Scanner s=new Scanner(System.in);
		System.out.println("1.MEN"+"2.WOMEN"+"3.back");
		char a=s.nextLine().charAt(0);
		if(a=='M'||a=='m') {
			men();
			
		}
		else if(a=='W'||a=='w') {
			women();
			
		}
		else if(a=='b'||a=='B') {
				back();		
		}
		else {
			puma();
			
		}s.close();


	}
	public void nike() {

		Scanner s=new Scanner(System.in);
		System.out.println("1.MEN"+"2.WOMEN"+"3.back");
		char a=s.nextLine().charAt(0);
		if(a=='M'||a=='m') {
			men();
			
		}
		else if(a=='W'||a=='w') {
			women();
			
		}
		else if(a=='b'||a=='B') {
						
		}
		else {
			nike();
			
		}s.close();
	}
	public void arrow () {
		Scanner s=new Scanner(System.in);
		System.out.println("1.MEN"+"2.WOMEN"+"3.back");
		char a=s.nextLine().charAt(0);
		if(a=='M'||a=='m') {
			men();
			
		}
		else if(a=='b'||a=='B') {
			name n =new name();
		}
		else {
			puma();
			
		}		s.close();
		}
public void back() {
	Scanner s=new Scanner(System.in);
	System.out.println("SELECT YOUR BRAND");
	System.out.println("PUMA AND NIKE AND ARROW and main page");
	
	char in = s.nextLine().charAt(0);
	if(in =='P'||in =='p') {
		puma();
	}
	else if (in=='N'|| in=='n') {
		nike();
	}
	else if(in=='A'||in=='a') {
		arrow();
	}else if(in=='m'||in=='M'){
	name n1=new name();
	 boolean main=n1.mainback();
	 if (main ==true) {
		 Scanner s1 = new Scanner (System.in);
		electronicsbrand e1= new electronicsbrand();
		
		System.out.println("#serach your product");
		char a= s1.nextLine().charAt(0);
		switch(a) {

		case 'f':  
			System.out.println("SELECT YOUR BRAND");
			System.out.println("PUMA AND NIKE AND ARROW");
			char inn = s1.nextLine().charAt(0);
			if(inn =='P'||inn =='p') {
				puma();
			}
			else if (inn=='N'|| inn=='n') {
				nike();
			}
			else if(inn=='A'||inn=='a') {
				arrow();
			}else {
				System.out.println("product was not identified");
			}break;

		case 'e':
			System.out.println("SELECT YOUR BRAND");
			System.out.println("DELL OR APPLE OR SAMSUNG");
			char n = s1.nextLine().charAt(0);
			if(n =='D'||n =='d') {
				e1.dell();
			}
			else if (n=='A'|| n=='a') {
				e1.apple();
			}
			else if(n=='S'||n=='s') {
				e1.samsung();
			}else {

 System.out.println("invalid input");

			}
			break;
		}

		s1.close();
		 
	 }
	
			
}s.close();
	}
 }
class electonics extends  flipkartorder{
	public void mobile() {
		System.out.println("1.order 2.ADD TO CART 3.CANCELED 4.back");
		Scanner s= new Scanner(System.in);
		char a=s.nextLine().charAt(0);
		if(a=='o'||a=='O') {
			order();
		}
		else if(a=='A'|| a=='a') {
			cart();
		}
		else if(a=='C'||a=='c') {
			System.out.println("PRODUCT IS CANCELLED");
		}else if(a=='B'||a=='B') 
		{
			electronicsbrand e1= new electronicsbrand();
			e1.back();
		}
		else {
			mobile();
		}
		s.close();
	}
	public void laptop() {
		System.out.println("1.order 2.ADD TO CART 3.CANCELED 4.back");
		Scanner s= new Scanner(System.in);
		char a=s.nextLine().charAt(0);
		if(a=='o'||a=='O') {
			order();
		}
		else if(a=='A'|| a=='a') {
			cart();
		}
		else if(a=='C'||a=='c') {
			System.out.println("PRODUCT IS CANCELLED");
		}else if(a=='B'||a=='B') 
		{
			electronicsbrand e1= new electronicsbrand();
			e1.back();
		}
		else {
			mobile();
		}s.close();

	}
	
	}

class electronicsbrand extends electonics{
	public void dell() {
		System.out.println("1.MOBILE OR 2.LAPTOP");
		Scanner s=new Scanner(System.in);
		char a= s.nextLine().charAt(0);
		
		 if(a=='L'||a=='l') {
			laptop();
		}
		else {
			dell();
		}
		s.close();

	}
    public void apple() {
		System.out.println("1.MOBILE OR 2.LAPTOP");
		Scanner s=new Scanner(System.in);
		char a= s.nextLine().charAt(0);
		if(a=='M' ||a=='m') {
			mobile();
		}
		else if(a=='L'||a=='l') {
			laptop();
		}
		else {
			apple();
		}
		s.close();
	}public void samsung() {
		System.out.println("1.MOBILE OR 2.LAPTOP");
		Scanner s=new Scanner(System.in);
		char a= s.nextLine().charAt(0);
		if(a=='M' ||a=='m') {
			mobile();
		}
		else if(a=='L'||a=='l') {
			laptop();
		}
		else {
			samsung();
			
		}
		s.close();
		
	}
	public void back() {
		Scanner s= new Scanner(System.in);
		System.out.println("SELECT YOUR BRAND");
		System.out.println("DELL OR APPLE OR SAMSUNG");
		char n = s.nextLine().charAt(0);
		if(n =='D'||n =='d') {
			dell();
		}
		else if (n=='A'|| n=='a') {
			apple();
		}
		else if(n=='S'||n=='s') {
			samsung();
		}else {
		}

s.close();
    }
}

 
public class Hybrid {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		electronicsbrand e1= new electronicsbrand();
		fashionbrand f1= new fashionbrand();
		System.out.println("#serach your product");
		char a= s.nextLine().charAt(0);
		switch(a) {

		case 'f':  
			System.out.println("SELECT YOUR BRAND");
			System.out.println("PUMA AND NIKE AND ARROW");
			char in = s.nextLine().charAt(0);
			if(in =='P'||in =='p') {
				f1.puma();
			}
			else if (in=='N'|| in=='n') {
				f1.nike();
			}
			else if(in=='A'||in=='a') {
				f1.arrow();
			}else {
				System.out.println("product was not identified");
			}break;

		case 'e':
			System.out.println("SELECT YOUR BRAND");
			System.out.println("DELL OR APPLE OR SAMSUNG");
			char n = s.nextLine().charAt(0);
			if(n =='D'||n =='d') {
				e1.dell();
			}
			else if (n=='A'|| n=='a') {
				e1.apple();
			}
			else if(n=='S'||n=='s') {
				e1.samsung();
			}else {



			}
			break;
		}

		s.close();

	}
		}
