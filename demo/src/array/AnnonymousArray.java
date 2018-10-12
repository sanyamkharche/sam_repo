package array;

public class AnnonymousArray {
	public static void main(String[] args) {
		sum(new int[] {10,20,30});
		}
	public static void sum(int[] x)
	{
		int tot = 0;
		for(int x1:x)
		{
			tot = tot+x1;
		}
		System.out.println("the sum is"+tot);
	}

}
