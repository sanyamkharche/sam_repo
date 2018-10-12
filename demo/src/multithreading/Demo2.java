package multithreading;
class sam extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
class Demo2
{
	public static void main(String[] args) {
		sam s=new sam();
		s.start();
		System.out.println("main merthod");
	}
}