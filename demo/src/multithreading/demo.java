package multithreading;

import array.AnnonymousArray;

class My extends Thread
{
	public void run()
	{
		AnnonymousArray a = new AnnonymousArray();
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
}
class demo
{
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			My t=new My();
			t.start();
			System.out.println("main thread");
		}
	}
}