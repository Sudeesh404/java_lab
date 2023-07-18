//java program to add two complex numbers
import java.util.Scanner;
public class ComplexNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Real part of the first number : ");
		int real = sc.nextInt();
		System.out.println("Enter the imaginary part of the first number : ");
		int img = sc.nextInt();
		System.out.println("First number is "+real+"+"+img+"i");
		System.out.println("Enter the Real part of the second number : ");
		int real2 = sc.nextInt();
		System.out.println("Enter the imaginary part of the second number : ");
		int img2 = sc.nextInt();
		System.out.println("Imaginary part of the number is "+real2+"+"+img2+"i");
		int real3 = real+real2;
		int img3 = img+img2;
		System.out.println("Sum off complex Numbers is "+real3+"+"+img3+"i");
		
	}
}