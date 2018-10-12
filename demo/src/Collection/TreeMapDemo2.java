package Collection;
import java.util.*;
public class TreeMapDemo2 {
public static void main(String[] args) {
	TreeMap t = new TreeMap(new MyTree());
	t.put("XXX", 20);
	t.put("AAA", 30);
	t.put("LLL", 50);
	t.put("ZZZ", 40);
	System.out.println(t);
}
}
class MyTree implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
