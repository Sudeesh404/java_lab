// java program to input data into the array
import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("Enter the value to be searched : ");
		int value = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				System.out.println("Value found at the position "+i);

			}
		}
		
	}
}