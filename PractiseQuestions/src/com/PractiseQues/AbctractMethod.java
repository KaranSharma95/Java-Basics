package com.PractiseQues;

abstract class Vehicle
{
	abstract void findType();//abstract method
	//To follow full abstraction we doesn't include concrete method/
	void display()//concrete method
	{
		System.out.println("All petrol based vehicle");
	}
	
}

class Car extends Vehicle
{

	@Override
	void findType() 
	{
		
		System.out.println("4 seater CAR");
	}
	
}

public class AbctractMethod {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.findType();
		car.display();
		
		//Vehicle v=new Vehicle();we cannot create abstract class object
		Vehicle v;//its allowed as it is only reference variable
		v=new Car();//
		v.findType();
		v.display();
	}