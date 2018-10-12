package Exception;

public class MultipleCatch {
public static void main(String[] args) {
	try
	{
		System.out.println(10/0);
	}
	catch(Exception e)
	{
		System.out.println(15/3);
	}

}
}
