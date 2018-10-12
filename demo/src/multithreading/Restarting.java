package multithreading;
class Abc extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
}
public class Restarting {
public static void main(String[] args) {
	Abc x=new Abc();
	x.start();
	System.out.println("hi");
	x.start();
}
}
