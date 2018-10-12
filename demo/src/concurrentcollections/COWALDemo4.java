package concurrentcollections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class COWALDemo4 {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	l.add("A");
	l.add("B");
	l.add("C");
	Iterator itr = l.iterator();
	l.add("D");
	while(itr.hasNext())
	{
		String s = (String)itr.next();
		System.out.println(s);
	}
}
}
