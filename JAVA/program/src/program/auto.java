package program;

import java.util.concurrent.Callable;

public class auto 
{
	public static void main(String[] args) {
		
		int a=6;
		int temp = a*a;
		
		int check=a;
		int res=0;
		while(check>0)
		{
			int rem = temp%10;
			res= res*10+rem;
		check=	check/10;
		}
		
		if(res==a)
		{
			System.out.println("automorphis");
		}
		else {
			System.out.println("not");
		}
		
		
	}

}
