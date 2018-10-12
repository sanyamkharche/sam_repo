package Collection;
import java.util.*;
public class TreeSetDemo5 {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new MyLength());
	t.add("A");
	t.add(new StringBuffer("ABC"));
	t.add(new StringBuffer("AA"));
	t.add("XX");
	t.add("ABCD");
	t.add("A");
	System.out.println(t);
}
}
class MyLength implements Comparator
{
	public int compare(Object obj1, Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1>l2)
			return 1;
		else if(l1<l2)
			return -1;
		else
			return s1.compareTo(s2);
	}
}
