package com.sanyam.demo.exception;

public class exception {
	public static void main(String[] args)
	{
try
{
	System.out.println(10/0);
}
catch(ArithmeticException e)
{
	System.out.println(10/2);
}
}
}