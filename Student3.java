package com.niit;

public class Student3 {
	int id;
	String name;
	int age;
	String dept;
	public Student3( int id, String name, int age, String dept)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	public void display()
	{
		System.out.println("id:"+id+" "+"name:"+name+" "+"age:"+age+" "+"dept:"+dept);
	}
	public static void main(String[] args)
	{
		Student3 obj=new Student3(15,"moni",22,"ece");
		obj.display();
	}

}
