package Collection;
import java.util.*;
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList l = new ArrayList<>();
	l.add("A");
	l.add(10);
	l.add(0, "S");
	l.add(2,"m");
	l.add(10);
	System.out.println(l.remove("S"));;
	System.out.println(l);
//	ArrayList l1 = new ArrayList(l);
//	System.out.println(l1);
//	System.out.println(l1.size());;
	
//	System.out.println(l.indexOf(10));
//	System.out.println(l.lastIndexOf(10));
	
	
}
}
