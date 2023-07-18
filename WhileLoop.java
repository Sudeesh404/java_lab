//program to check if a number is palindrome using while loop in java

public class WhileLoop
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
		if(temp == s)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not palindrome");
		}
	}
	
}
