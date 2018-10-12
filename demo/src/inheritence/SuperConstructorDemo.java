package inheritence;
public class SuperConstructorDemo {
SuperConstructorDemo()   //parent class constructor
{
	System.out.println("Parent 0-arg constructor");
} // if parent class doesnt contain any constructor then default parent class constructor will
  // be executed which is 0-arg constructor and has an empty implementation
}
class Child2 extends SuperConstructorDemo
{
	Child2()
	{
		this(10);
		// this(10);
		// super();------- this terminology is not allowed
		System.out.println("Child 0-arg constructor");
	}
	Child2(int a)
	{
		super();   //super() should be the first statement only. otherwise we will get compile error
		System.out.println("Child 1-arg constructor");
	}
	public static void main(String[] args) {
		new Child2();
	}
}