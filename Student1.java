package com.niit;

public class Student1 
{
	int id;
	String name;
	int age;
	 public  Student1( int i,String n, int a)
	{
		 id=i;
		 name=n;
		 age=a;
	
	}
	 public void display()
	 {
		 System.out.println( "id:"+id+" "+"name:"+name+" "+"age:"+age);
	 }
	 public static void main(String[] args)
	 {
		 Student1 obj=new Student1( 1523,"bala",21);
		 obj.display();
	 }
}
	


