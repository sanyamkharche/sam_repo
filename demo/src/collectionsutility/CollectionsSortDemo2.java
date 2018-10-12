package collectionsutility;
import java.util.*;
public class CollectionsSortDemo2 {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add(10);
	l.add(30);
	l.add(25);
	l.add(40);
	System.out.println("Before sorting"+l);
	Collections.sort(l, new MyList());
	System.out.println("After sorting"+l);
}
}
class MyList implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}
