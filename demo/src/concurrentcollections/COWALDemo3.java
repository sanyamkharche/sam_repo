package concurrentcollections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class COWALDemo3 {
public static void main(String[] args) {
	CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
	l.add("A");
	l.add("B");
	l.add("C");
	l.add("D");
	System.out.println(l);
	Iterator<String> itr = l.iterator();
	while(itr.hasNext())
	{
		String s = (String)itr.next();
		if(s.equals("D"))
		{
			itr.remove();
		}
	}
	System.out.println(l);
}
}
