package arraysutility;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysSearchDemo {
public static void main(String[] args) {
	int[] a = {10,5,6,11,20};
	Arrays.sort(a);
	System.out.println(Arrays.binarySearch(a,6));
	System.out.println(Arrays.binarySearch(a,18));
	
	String[] s = {"S","A","M"};
	Arrays.sort(s);
	System.out.println(Arrays.binarySearch(s,"S"));
	System.out.println(Arrays.binarySearch(s,"K"));
	Arrays.sort(s, new MySearch());
	System.out.println(Arrays.binarySearch(s,"S", new MySearch()));
	System.out.println(Arrays.binarySearch(s,"K", new MySearch()));
}
}
class MySearch implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
