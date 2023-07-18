class ParaConstructor
{
	int x;
	String name;
	ParaConstructor(int y, String z)
	{
		x = y;
		name = z;
		System.out.println("\ninside constructor");
		System.out.println(x);
		System.out.println(name);
	
	}
	public void display ()
	{
		System.out.println("\ninside function");
		System.out.println("x = "+x);
		System.out.println("Name = "+name);
		
	}
	public static void main(String[] args)
	{
		ParaConstructor c = new ParaConstructor(10,"sudeesh");
		System.out.println("\nInside main");
		System.out.println("x = "+c.x);
		System.out.println("name = "+c.name);
		c.display();
		
	}
}