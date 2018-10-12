package Collection;
import java.util.*;
public class WeakHashMapDemo2 //with WeakHashMap
{
public static void main(String[] args) throws Exception
{
	WeakHashMap m = new WeakHashMap();
	Weak t = new Weak();
	m.put(t, "Sam");
	System.out.println(m);
	t = null;
	System.gc();
	Thread.sleep(5000);
	System.out.println(m);
}
}
class Weak
{
	public String toString()
	{
		return "Temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method called");
	}
}
