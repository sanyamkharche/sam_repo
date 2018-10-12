package Collection;
import java.util.*;
class StackDemo
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		s.push("D");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("B"));
		System.out.println(s.search("Z"));
	}
}