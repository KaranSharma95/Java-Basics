package com.HierarchicalInheritance;

import java.util.Scanner;

class Vehicle
{
	private String model;
	private int year;
	private String fuelType;
	
	public void getVehicleDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter model,year,fuelType");
		model=sc.next();
		year=sc.nextInt();
		fuelType=sc.next();
	}
	
	public void putVehicleDetails()
	{
		System.out.println(model+" "+year+" "+fuelType);
	}
	
}

class Truck extends Vehicle
{
	private double cargoCapacity;
	
	public void getTruckDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cargoCapacity");
		cargoCapacity=sc.nextDouble();
		
	}
	
	public void putTruckDetails()
	{
		System.out.println(cargoCapacity);
	}
}

class Car extends Vehicle
{ 
	private int seat;
	
	public void getCarDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of seat");
		seat=sc.nextInt();
	}
	
	public void putCarDetails()
	{
		System.out.println(seat);
	}
	
}

public class TestHieraricalInheritance {

	public static void main(String[] args) {
		
			Truck t=new Truck();
			System.out.println("turck details");
			t.getVehicleDetails();
			t.getTruckDetails();
			t.putVehicleDetails();
			t.putTruckDetails();
			
			Car c=new Car();
			System.out.println("Car details");
			c.getVehicleDetails();
			c.getCarDetails();
			c.putVehicleDetails();
			c.putCarDetails();
			
	}

}