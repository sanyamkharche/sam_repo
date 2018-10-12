package Collection;
import java.util.*;
public class TreeSetDemo3 {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new MyOrder());
	t.add("roja");
	t.add("sam");
	t.add("chetu");
	t.add("kush");
	t.add("roshu");
	t.add("kiran");
	System.out.println(t);
}
}
class MyOrder implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
//		String s1 = obj1.toString();
//		String s2 = obj2.toString();
//		return -s1.compareTo(s2);
//		return s2.compareTo(s1);
	}
}