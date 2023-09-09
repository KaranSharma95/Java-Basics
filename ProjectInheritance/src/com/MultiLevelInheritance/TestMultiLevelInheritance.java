package com.MultiLevelInheritance;

import java.util.Scanner;

class Employee
{
	private int id;
	private String name;
	
	void getEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name and id:");
		
		name=sc.nextLine();
		id=sc.nextInt();
	}
	
	void putEmployee()
	{
		System.out.println(id+" "+name);
	}
}
class Manager extends Employee
{
	private String department;
	
	void getManagerDetails()
	{
		getEmployee();
		System.out.println("Enter the depaetnemt:");
		department=new Scanner(System.in).next();
	}

	void putManagerDetails()
	{
		putEmployee();
		System.out.println(department);
	}
}

class AreaManager extends Manager
{
	String location;
	void getAreaManagerDetails()
	{
		getManagerDetails();
		System.out.println("Enter the area of the manager:");
		location=new Scanner(System.in).next();
	}
	
	void putAreaManagerDetails()
	{
		putManagerDetails();
		System.out.println(location);
	}
}
public class TestMultiLevelInheritance {

	public static void main(String[] args) {
		AreaManager ob = new AreaManager();
		ob.getAreaManagerDetails();
		ob.putAreaManagerDetails();

	}

}
