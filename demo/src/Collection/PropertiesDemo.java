package Collection;
import java.util.*;
import java.io.*;
public class PropertiesDemo {
public static void main(String[] args) throws Exception
{
	Properties p = new Properties();
	FileInputStream fis = new FileInputStream("E:/javaProgram/demo/src/Collection/xyz.properties");
	p.load(fis);
	System.out.println(p);
	String s = p.getProperty("sam");
	System.out.println(s);
	p.setProperty("kush", "8888");
	FileOutputStream fos = new FileOutputStream("E:/javaProgram/demo/src/Collection/xyz.properties");
	p.store(fos, "Updated by Sam for Java");
	String a = p.getProperty("kush");
	System.out.println(a);
}
}
