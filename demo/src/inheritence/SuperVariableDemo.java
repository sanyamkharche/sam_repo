package inheritence;
public class SuperVariableDemo {
int a = 10;
int b = 20;				//super.  for parent members
}
class Child extends SuperVariableDemo
{
	int a = 100;
	int b = 200;		//this. for child members
	void add(int a, int b)
	{
		System.out.println(a+b);//Local
		System.out.println(this.a+this.b);//current
		System.out.println(super.a+super.b);//parent
	}
	public static void main(String[] args)
	{
		new Child().add(1000, 2000);
	}
}
