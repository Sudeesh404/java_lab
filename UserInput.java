//java program with user input by importing scanner
import java.util.Scanner;
public class UserInput
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone Number: ");
		int phone = sc.nextInt();
		System.out.println("Name is "+name);
		System.out.println("Phone number is : "+phone);
	}

}