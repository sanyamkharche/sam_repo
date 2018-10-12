package collectionsutility;
import java.util.*;
public class CollectionsSortDemo {
public static void main(String[] args) {
	ArrayList<String> l = new ArrayList<String>();
	l.add("Z");
	l.add("A");
	l.add("K");
	l.add("N");
	//l.add(null);
	System.out.println("Before sorting"+l);
	Collections.sort(l);
	System.out.println("After sorting"+l);
}
}
