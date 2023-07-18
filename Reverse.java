//program to find reverse of num usin while loop

public class Reverse
{
	public static void main(String[] args)
	{
		int n=441;
		int temp = n;
		int s=0;
		int r =0;
		while(n!=0)
		{
			r = n%10;
			s = (10*s)+r;
			n=n/10;
		}
	
			System.out.println("Reverse of "+temp+" is "+s);
		
	}
	
}
