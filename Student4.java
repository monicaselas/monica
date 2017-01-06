package com.niit;

public class Student4 
{
	int id;
	String name;
	String dept;
	int age;
	public Student4(int i, String n)
	{
		id=i;
		name=n;
	}
	public Student4(int i,String n,String d)
	{
		id=i;
		name=n;
		dept=d;
	}
	public Student4(int i,String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	public void display()
	{
		System.out.println("id:"+id+" "+"name:"+name+" "+"dept:"+dept+" "+"age:"+age);
	}
	public static void main(String[] args)
	{
		Student4 obj1=new Student4( 11,"moni");
		Student4 obj2=new Student4( 12,"bala", "ece");
		Student4 obj3=new Student4( 13,"sweety", 23);
		obj1.display();
		obj2.display();
		obj3.display();
		
	}

}
