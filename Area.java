import java.util.*;
class Area
{
	int l,w,h,a;
	double ar,b,r;
	public void area(double r)
	{
		Scanner sc = new Scanner(System.in);             //area of circle
		System.out.println("Enter radius of circle : ");
		r = sc.nextInt();
		ar = 3.14*r*r;
		System.out.println("Area of circle = "+ar);
		
		
	} 
	public void area(int a)                             //area of square
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side of square : ");
		a = sc.nextInt();
		ar = a*a;
		System.out.println("Area of square = "+ar);
		
		
	}
	public void area(double b, int h)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breadth of triangle : ");
		b = sc.nextInt();
		System.out.println("Enter height of triangle : ");
		h = sc.nextInt();
		ar = 0.5*b*h;
		System.out.println("Area of triangle = "+ar);
		
		
	}
	public void area(int l, int w)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle : ");
		l = sc.nextInt();
		System.out.println("Enter width of rectangle : ");
		w = sc.nextInt();
		ar = l*w;
		System.out.println("Area of rectangle = "+ar);
		
		
	}
	public static void main(String[] args)
	{
		Area obj = new Area();
		obj.area(1,2);
		obj.area(2.0,4);
		obj.area(1);
		obj.area(4.0);
	}
}