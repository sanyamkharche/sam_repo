package inheritence;
public class SuperConstructorDemo2 {
SuperConstructorDemo2(int a)   //parent class constructor
{
	System.out.println("Parent 1-arg constructor");
} // if parent class contain 1-arg constructor and we are calling 0-arg parent class constructor
  // then default parent class constructor wont be executed and
  //we will get compile error saying "The constructor SuperConstructorDemo2() is undefined"
}
class Child3 extends SuperConstructorDemo2
{
	Child3()
	{
		this(10);
		// this(10);
		// super();------- this terminology is not allowed
		System.out.println("Child 0-arg constructor");
	}
	Child3(int a)
	{
		super(10);   //super() should be the first statement only. otherwise we will get compile error
		System.out.println("Child 1-arg constructor");
	}
	public static void main(String[] args) {
		new Child3();
	}
}