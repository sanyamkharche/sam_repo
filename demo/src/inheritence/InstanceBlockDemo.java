package inheritence;
public class InstanceBlockDemo {
	{
		System.out.println("parent class instance block");
	}
	InstanceBlockDemo()
	{
		System.out.println("parent class constructor");
	}
}
class Child6 extends InstanceBlockDemo
{
	{
		System.out.println("child class instance block");
	}
	Child6()
	{
		System.out.println("child class constructor");
	}
	public static void main(String[] args) {
		new Child6();
	}
}
