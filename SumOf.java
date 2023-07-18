//program to find sum of dgits in a num using while loop

public class SumOf
{
	public static void main(String[] args)
	{
		int n=881;
		int temp = n;
		int s=0;
		int r =0;
		while(n!=0)
		{
			r = n%10;
			s = s+r;
			n=n/10;
		}
	
			System.out.println("Sum of digits in "+temp+" is "+s);
		
	}
	
}