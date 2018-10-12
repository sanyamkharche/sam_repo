package Collection;
import java.util.*;
public class WeakHashMapDemo //without WeakHashMap
{
public static void main(String[] args) throws Exception
{
	HashMap m = new HashMap();
	Temp t = new Temp();
	m.put(t, "Sam");
	System.out.println(m);
	t = null;
	System.gc();
	Thread.sleep(5000);
	System.out.println(m);
}
}
class Temp
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
