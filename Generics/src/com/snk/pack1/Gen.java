package com.snk.pack1;
//Our own defined generic class
public class Gen<T> {
	T ob;
	Gen(T ob)
	{
		this.ob = ob;
	}
	public void show()
	{
		System.out.println("The type of object:"+ob.getClass().getName());
	}
	public T getOb()
	{
		return ob;
	}
}
