package inheritence;
public class SuperConstructorDemo3 {
	SuperConstructorDemo3()
{
	System.out.println("parent class 0-arg constructor");
}
}
class Child4 extends SuperConstructorDemo3
{
	Child4()
	{
		//super();----- it is generated by compiler automatically
		System.out.println("child class 0-arg constructor");
	}
	Child4(int a)
	{
		//super();----- it is generated by compiler automatically
		System.out.println("child class 1-arg constructor");
	}
	public static void main(String[] args) {
		new Child4();
		new Child4(10);
	}
}
