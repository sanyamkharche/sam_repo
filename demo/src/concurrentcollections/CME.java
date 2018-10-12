package concurrentcollections;
import java.util.*;
public class CME extends Thread
{
	static ArrayList<String> l = new ArrayList<String>();
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
		l.add("D");
	}
	public static void main(String[] args) throws InterruptedException
	{
		l.add("A");
		l.add("B");
		l.add("C");
		CME t = new CME();
		t.start();
		Iterator<String> itr = l.iterator();
		while(itr.hasNext())
		{
			String s1 = (String)itr.next();
			System.out.println("main thread iterating List elements: Object is:"+s1);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
