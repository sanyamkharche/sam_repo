package Exception;

public class TryCatch {
public static void main(String[] args) {
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e){}
	finally
	{
		System.out.println("Hi");
	}
}
}
