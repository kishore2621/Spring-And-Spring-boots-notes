package program;

public class pal 
{
	
	
	public static void check(int a)
	{
	
	int temp=a; 
	int ress=0;
	

	while(temp>0) {
		int rem=temp%10;
		ress=(ress*10)+rem;
		temp=temp/10;

	}
	
	if(a==ress) 
	{
		System.out.println("this is palindome"+ress);
	}else 
	{
		System.out.println("this is not palindome"+ress);
		
		
			
		}
	}
	
	public static void main(String[] args) 
	{
		check(121);
		
	}
}

