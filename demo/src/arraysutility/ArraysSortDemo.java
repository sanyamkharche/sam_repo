package arraysutility;
import java.util.Arrays;
import java.util.Comparator;
public class ArraysSortDemo {
public static void main(String[] args) {
	int[] a = {10,5,20,15};
	System.out.println("Primitive array before sorting:");
	for(int a1:a)
	{
		System.out.println(a1);
	}
	Arrays.sort(a);
	System.out.println("Primitive array after sorting:");
	for(int a1:a)
	{
		System.out.println(a1);
	}
	/*Arrays.sort(a, new MyOrder());
	System.out.println("Primitive array after sorting by Comparator");
	for(int a1:a)
	{
		System.out.println(a1);
	}*/

	String[] s = {"S","A","M"};
	System.out.println("Object array before sorting:");
	for(String a1:s)
	{
		System.out.println(a1);
	}
	Arrays.sort(s);
	System.out.println("Object array after sorting:");
	for(String a1:s)
	{
		System.out.println(a1);
	}
	Arrays.sort(s, new MyString());
	System.out.println("Object array after sorting by Comparator:");
	for(String a1:s)
	{
		System.out.println(a1);
	}
}
}
class MyString implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
/*class MyOrder implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
}*/
