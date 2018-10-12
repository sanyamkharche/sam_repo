package Collection;
import java.util.*;
public class TreeSetDemo2 {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new MyComparator());
	t.add(10);
	t.add(0);
	t.add(15);
	t.add(5);
	t.add(20);
	t.add(20);
	System.out.println(t);
}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	//Various Methods for above program
//		return +1;
//		return -1;
//		return 0;
//		return I1.compareTo(I2);
//		return I2.compareTo(I1);
//		return -I1.compareTo(I2);
//		return -I2.compareTo(I1);
	}
}