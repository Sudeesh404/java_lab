//java program to add two matrices
import java.util.Scanner;
public class AddMatrix
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the no of rows in first matrix\n");
		int r = s.nextInt();
		System.out.println("\nEnter the no of columns in first matrix\n");
		int c = s.nextInt();
		System.out.println("\nEnter matrix values :\n");
		int arr[][] = new int[r][c];
		for(int i =0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("\nThe Matrix is :\n");
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("\nEnter the no of rows in second matrix\n");
		int row = s.nextInt();
		System.out.println("\nEnter the no of columns in second matrix\n");
		int col = s.nextInt();
		System.out.println("\nEnter matrix values :\n");
		int arr2[][] = new int[row][col];
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr2[i][j]=s.nextInt();
			}
		}
		System.out.println("\nThe Matrix is :");
		for(int i =0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		int arr3[][] = new int[r][c];
		if(r == row && col == c)
		{
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					arr3[i][j] = arr[i][j] + arr2[i][j];
				}
			}
			
			System.out.println("\nThe sum of Matrices is :");
			for(int i =0;i<arr3.length;i++)
			{
				for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println("\nAddition operation not possible matrix are of different order!!");
		}
		
	}
}