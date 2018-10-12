package collectionsutility;
import java.util.*;
public class CollectionsReverseDemo {
public static void main(String[] args) {
	Vector<Object> v = new Vector<Object>();
	v.addElement(10);
	v.addElement(0);
	v.addElement("A");
	v.addElement(7);
	v.addElement("S");
	System.out.println(v);
	Collections.reverse(v);
	System.out.println(v);
}
}
