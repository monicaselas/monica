package com.niit;

public class Student
{
	private int id;
	private  String name;
    private float average;
	private char grade;
	private int num1,num2,num3,num4,num5;
	public Student ()
	{
       
	  
	}
	public Student ( int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public Student(int num1,int num2, int num3, int num4,int num5)

	{
	this.num1=num1;
	this.num2=num2;
	this.num3=num3;
	this.num4=num4;
	this.num5=num5;
		

	}
public void average()
{	average=(num1+num2+num3+num4+num5)/5;

}


public void grade()
{
	if(average<50)
	{
	grade='f';
	}

   else if(average>=50 && average<60)
	 {  
		       grade='d';  

     }
	 else if(average>=60 && average<70)
	 {
		 grade='c';
	 }
	 else if(average>=70 && average<80)
	 {
		 grade='b';
	 }
	 else if(average>=80 && average<90)
	 {
		 grade='a';
	 }
}
	 
	 
	public void display()
	{
		System.out.print("id:"+id+" name:"+name);
	}

	public void display2(){
		System.out.print(" mark:"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+" average:"+average+" grade: "+grade);

	}
public static void main(String[] args)
{
	Student obj=new Student();
	Student obj1=new Student(001,"moni");
	Student obj2=new Student(95,85,75,95,95);
obj2.average();
obj2.grade();
obj1.display();
obj2.display2();

}
}