package inheritence;
public class SuperMethodDemo {
void m1()
{
	System.out.println("parent m1 method");
}
}
class Child1 extends SuperMethodDemo
{
	void m1()
	{
		System.out.println("child m1 method");
	}
	void m2()
	{
		this.m1();    //here (this.) is optional
		super.m1();
	}
	public static void main(String[] args) {
		new Child1().m2();
	}
}
