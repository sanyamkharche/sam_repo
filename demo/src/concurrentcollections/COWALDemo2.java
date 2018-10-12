package concurrentcollections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
class MyList extends Thread
{
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("child thread updating List");
		l.add("C");
	}
	public static void main(String[] args) throws InterruptedException
	{
		l.add("A");
		l.add("B");
		MyList t = new MyList();
		t.start();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String s1 = (String)itr.next();
			System.out.println("main thread iterating List elements: Object is:"+s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
