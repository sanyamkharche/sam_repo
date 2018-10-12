package Collection;
import java.util.*;
public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap m = new LinkedHashMap();
	m.put("chiranjivi", 700);
	m.put("balaiah", 800);
	m.put("venketesh", 200);
	m.put("nagarjuna", 500);
	System.out.println(m);
	System.out.println(m.put("chiranjivi", 1000));
	Set s = m.keySet();
	System.out.println(s);
	Collection c = m.values();
	System.out.println(c);
	Set s1 = m.entrySet();
	System.out.println(s1);
	Iterator itr = s1.iterator();
	while(itr.hasNext())
	{
		Map.Entry m1 = (Map.Entry)itr.next();
		System.out.println(m1.getKey()+"..."+m1.getValue());
		if(m1.getKey().equals("nagarjuna"));
		{
			m1.setValue(10000);
		}
	}
	System.out.println(m);
}
}
