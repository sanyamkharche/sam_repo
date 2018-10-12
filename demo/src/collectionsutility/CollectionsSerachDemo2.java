package collectionsutility;
import java.util.*;
class MySearch implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
}
public class CollectionsSerachDemo2 {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	l.add("Z");
	l.add("A");
	l.add("M");
	l.add("K");
	l.add("a");
	System.out.println(l);
	//Comparator new MySearch2() = Collections.reverseOrder(new MySearch());
	Collections.sort(l,new MySearch());
	System.out.println(l);
	System.out.println(Collections.binarySearch(l, "Z", new MySearch()));
	System.out.println(Collections.binarySearch(l, "B", new MySearch()));
}
}
