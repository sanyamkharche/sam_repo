package concurrentcollections;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class COWALDemo {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add("A");
	l.add("B");
	System.out.println("l is"+l);
	CopyOnWriteArrayList<String> l1 = new CopyOnWriteArrayList<>();
	l1.addIfAbsent("A");
	l1.addIfAbsent("C");
	System.out.println("l1 is"+l1);
	l1.addAll(l);
	System.out.println("new l1 is"+l1);
	ArrayList l2 = new ArrayList();
	l2.add("A");
	l2.add("E");
	System.out.println("l2 is"+l2);
	l1.addAllAbsent(l2);
	System.out.println("final l1 is"+l1);
}
}
