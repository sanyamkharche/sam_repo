package concurrentcollections;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapDemo {
public static void main(String[] args) {
	ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<Integer,String>();
	m.put(101,"A");
	m.put(102, "B");
	m.put(103, "C");
	m.putIfAbsent(101, "F");
	System.out.println(m.putIfAbsent(101, "F"));
	m.putIfAbsent(104, "D");
	System.out.println(m.putIfAbsent(104, "D"));
	m.remove(102, "D");
	System.out.println(m.remove(102, "D"));
	m.remove(102, "B");
	m.replace(101, "C");
	m.replace(103, "F");
	System.out.println(m);
}
}
