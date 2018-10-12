package arraysutility;
import java.util.*;
public class ArrayToList {
public static void main(String[] args) {
	String[] s = {"S","A","M"};
	for(String a1:s)
	{
		System.out.println(a1);
	}
	List l = Arrays.asList(s);
	System.out.println(l);
	l.set(1,"B");
	s[2] = "Z";
	for(String a1:s)
	{
		System.out.println(a1);
	}
	System.out.println(l);
	//l.add("K");
	//l.set(0, new Integer(8));
}
}
