package com.niit;

public class Overloading
{
	public void add(int a, int b,int c, int d)
	{
		System.out.println (a+b+c+d);
	}
	public void add( float a,float b, int c)
	{
		System.out.println (a+b+c);
		
	}
	public void add(String s1, String s2)
	{
		System.out.println (s1+s2);
	}
	
	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.add(15,23,15,23);
		obj.add("moni", "bala");
		obj.add(15f,97f, 23);
		
		
		
	}

}
