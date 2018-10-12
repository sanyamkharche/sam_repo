package inheritence;
public class StaticBlockDemo {
	{
		System.out.println("parent class instance block");
	}
	StaticBlockDemo()
	{
		System.out.println("parent class constructor");
	}
	static
	{
		System.out.println("parent class static block");
	}
}
class Child7 extends StaticBlockDemo
{
	{
		System.out.println("child class instance block");
	}
	Child7()
	{
		System.out.println("child class constructor");
	}
	static
	{
		System.out.println("child class static block");
	}
	public static void main(String[] args) {
		new Child7();
		new Child7();
	}
}
