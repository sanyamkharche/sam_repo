package concurrentcollections;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class MyThread extends Thread {
static ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>();
public void run()
{
	try
	{
		Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
		
	}
	System.out.println("child thread updating map");
	m.put(103, "C");
}
public static void main(String[] args) throws InterruptedException
{
	m.put(101, "A");
	m.put(102, "B");
	MyThread t = new MyThread();
	t.start();
	Set<Integer> s1 = m.keySet();
	//System.out.println(s1);
	Iterator<Integer> itr = s1.iterator();
	while(itr.hasNext())
	{
		Integer i1 = (Integer)itr.next();
		System.out.println("main thread iterating and current entry is:"+i1+"....."+m.get(i1));
		Thread.sleep(3000);
	}
	System.out.println(m);
}
}
