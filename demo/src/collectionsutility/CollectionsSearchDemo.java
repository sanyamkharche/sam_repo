package collectionsutility;
import java.util.*;
public class CollectionsSearchDemo {
public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<String>();
	l.add("Z");
	l.add("A");
	l.add("K");
	l.add("M");
	l.add("a");
	System.out.println(l);
	Collections.sort(l);;
	System.out.println(l);
	System.out.println(Collections.binarySearch(l, "M"));
	System.out.println(Collections.binarySearch(l, "B"));
}
}
