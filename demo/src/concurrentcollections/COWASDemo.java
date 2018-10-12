package concurrentcollections;
import java.util.concurrent.*;
import java.util.*;
public class COWASDemo {
public static void main(String[] args) {
	CopyOnWriteArraySet<Object> s = new CopyOnWriteArraySet<>();
	s.add("A");
	s.add("B");
	s.add("C");
	s.add("A");
	s.add(null);
	s.add(10);
	s.add("D");
	System.out.println(s);
}
}
