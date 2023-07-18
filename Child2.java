class Parent
{
	public void display()
	{
		System.out.println("This is the parent class");   //main class aka parent class
	}
}
class Child extends Parent					//child class who inherits the main class
{
	public void fuse()
	{
		System.out.println("This is the first child");
	}
}
public class Child2 
{
	public static void main(String[] args)
	{
		Child b = new Child();
		b.display();
		b.fuse();
	}
}
