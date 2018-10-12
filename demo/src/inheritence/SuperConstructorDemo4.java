package inheritence;
public class SuperConstructorDemo4 {
	SuperConstructorDemo4()
{
	System.out.println("parent class 0-arg constructor");
}
}
class Child5 extends SuperConstructorDemo4
{
	public static void main(String[] args) {
		new Child5();
	}
}
// if we call child constructor and there is no such constructro preseent then compiler
// generates an empty 0-arg child class constructor with an empty implementation and also place
// super(); statement in first place. Hence we get the output as "parent class 0-arg constructor"
