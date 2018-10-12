package Collection;
import java.util.*;
public class TreeSetDemo1 {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add("K");
	t.add("Z");
	t.add("A");
	System.out.println(t.add("A"));
	System.out.println(t.add("K"));
	System.out.println(t);
}
}
