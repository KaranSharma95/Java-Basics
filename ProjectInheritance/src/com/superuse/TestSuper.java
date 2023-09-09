package com.superuse;
/*
class Bird
{
	String name;
	Bird()
	{
		name="Different names of bird";
	}
	
	void display()
	{
		System.out.println(name);
	}
}

class Sparrow extends Bird{
	String name;
	
	Sparrow()
	{
		name="sparrow";
	}
	
	void display()
	{
		System.out.println(super.name+" "+name);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		
		Sparrow sp=new Sparrow();
		sp.display();
		
	}

}
*/
/*
//using method....
class Bird
{
	String name;
	Bird()
	{
		name="Different names of bird";
	}
	
	void display()
	{
		System.out.println("parent class:"+name);
	}
}

class Sparrow extends Bird{
	String name;
	
	Sparrow()
	{
		name="sparrow";
	}
	
	void display()
	{
		super.display();
		System.out.println("child class:"+name);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		
		Sparrow sp=new Sparrow();
		sp.display();
		
	}

}
*/

//using super invoke constructor...
class Employee
{
	private int id;
	private String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
}
class Manager extends Employee
{
	String task;
	Manager(int id,String name,String task)
	{
		super(id,name);
		this.task=task;
	}
	
	void display()
	{
		super.display();
		System.out.println(task);
	}
}




public class TestSuper {

	public static void main(String[] args) {
	
		Manager manager=new Manager(101,"Ajay","Employee management task");
	
		manager.display();
	}
}