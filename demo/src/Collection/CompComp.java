package Collection;
import java.util.*;
/*class Employee implements Comparable 
{
String name;
int eid;
Employee(String name, int eid)
{
	this.name = name;
	this.eid = eid;
}
public String toString()
{
	return name + "--"+eid;
}
public int compareTo(Object obj)
{
	int eid1 = this.eid;
	Employee e = (Employee)obj;
	int eid2 = e.eid;
	if(eid1<eid2)
	{
		return -1;
	}
	else if(eid1>eid2)
	{
		return 1;
	}
	else
		return 0;
}
}
public class CompComp
{
	public static void main(String[] args) 
	{
	Employee e1 = new Employee("nag",100);
	System.out.println(e1.toString());
	Employee e2 = new Employee("balaiah",200);
	Employee e3 = new Employee("chiru",50);
	Employee e4 = new Employee("venki",150);
	Employee e5 = new Employee("nag",100);
	TreeSet t = new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
	TreeSet t1 = new TreeSet(new MySorting());
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);
	//System.out.println(t1);
	}
}
class MySorting implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
}*/

class Employee implements Comparable{
	String name;
	int eid;
	public Employee(String name, int eid) {
		this.eid = eid;
		this.name = name;
	}
	
	public String toString()
	{
		return name+"--"+eid;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		Employee e = (Employee) o;
		int eid2 = e.eid;
		
		if(eid1<eid2)
			return -1;
		else if (eid1>eid2)
			return 1;
		else
			return 0;
	}
	
}

public class CompComp {
	public static void main(String[] args) {
		Employee e1 = new Employee("sam", 120);
		Employee e2 = new Employee("vijay", 100);
		Employee e3 = new Employee("kushal", 80);
		Employee e4 = new Employee("chetan", 150);
		
//		TreeSet t1 = new TreeSet<>();
//		t1.add(e1);
//		t1.add(e2);
//		t1.add(e3);
//		t1.add(e4);
//		
//		System.out.println(t1);
		
		TreeSet t1 = new TreeSet<>(new MySorting());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		
		System.out.println(t1);
	}
}

class MySorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
}