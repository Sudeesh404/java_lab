class MyConstructor
{
	int x;
	MyConstructor()  //constructor creation
	{
		System.out.println(" This is a consrtuctor");
		x = 5;
		System.out.println(x);
	}
	public static void main (String [] args)
	{
		MyConstructor b = new MyConstructor();  // object  creation
		
	System.out.println(b.x);
	}
}