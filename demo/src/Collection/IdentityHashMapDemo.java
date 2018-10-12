package Collection;
import java.util.*;
public class IdentityHashMapDemo {
public static void main(String[] args) {
	IdentityHashMap m = new IdentityHashMap();
	Integer I1 = new Integer(10);
	Integer I2 = new Integer(10);
	m.put(I1, "sam");
	m.put(I2, "kush");
	System.out.println(m);
}
}
