package Collection;
import java.util.*;
public class HashtableDemo {
public static void main(String[] args) {
	Hashtable h = new Hashtable();//enter initial capacity and see the result
	h.put(new Tab(5), "A");
	h.put(new Tab(2), "B");
	h.put(new Tab(6), "C");
	h.put(new Tab(15), "D");
	h.put(new Tab(23), "E");
	h.put(new Tab(16), "F");
	//h.put("durga", null);
	System.out.println(h);
}
}
class Tab
{
	int i;
	Tab(int i)
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;    //change the code and see the result
	}
	public String toString()
	{
		return i+"";
	}
}
