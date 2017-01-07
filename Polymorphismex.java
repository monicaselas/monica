package com.niit;

public class Polymorphismex 
{
	public class Employee
	{
		private int empid;
		private String name;
		public void setempid(int empid){
			this.empid=empid;
		}
		public void setname(String name)
		{
			this.name=name;
		}
		public int getempid()
		{
			return empid;
		}
		public String getname()
		{
			return name;
		}
		public String getdetails()
		{
			System.out.println("inside employee getdetails()");
			return "Employeeid:"+empid+"Employeename:"+name; 
		}
	}
	public class Manager extends Employee
	{
		private String deptname;
		public void setdeptname( String deptname)
		{
		this.deptname=deptname;	
		}
		public String getdeptname()
		{
			return deptname;
			
		}
		public String getdetails()
		{
			System.out.println("inside of manager getdetails()");
			//return "Employeeid:"+empid+"Employeename:"+name;
			return "deptname:"+deptname;  
		}
	}
	public static void main(String[] args)
	{
		Polymorphismex poly=new Polymorphismex();
		Manager m=poly.new Manager();
				m.setempid(101);
				m.setname("bala");
				m.setdeptname("ece");
				System.out.println(m.getdetails());
						
		Employee e=poly.new Employee();
		e.setempid(102);
		e.setname("moni");
	
		System.out.println(e.getdetails());
		
		
	}

}
