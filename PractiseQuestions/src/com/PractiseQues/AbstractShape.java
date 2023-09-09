package com.PractiseQues;

abstract class Shape
{
	public abstract double findarea();
	public abstract double findperimeter();
	
}

 class Circle extends Shape
{
	private double radius;
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double findarea()
	{
		return Math.PI*radius*radius*radius;
		
	}
	
	public double findperimeter()
	{
		return 2*Math.PI*radius;
	}
}

class rectangle extends Shape
{

	private double length;
	private double width;
	
	public rectangle(double length, double width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	public double findarea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double findperimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
		}
	
}

class triangle extends Shape
{

	 private double side1;
	 private double side2;
	 private double side3;
	 public triangle (double side1, double side2, double side3)
	 {
		 this.side1=side1;
		 this.side2=side2;
		 this.side3=side3;
	 }
	@Override
	public double findarea() {
		// TODO Auto-generated method stub
		double s=(side1+side2+side3);
			return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	@Override
	public double findperimeter() {
		// TODO Auto-generated method stub
		return side1+side2+side3;
	}
	}
public class AbstractShape {

	public static void main(String[] args) {
		double r=4.0;
		Circle circle=new Circle(r);
		double rs1=4.0, rs2=6.0;
		double ts1=3.0, ts2=4.0,ts3=5.0;
		rectangle rectangle=new rectangle(rs1,rs2);
		triangle triangle=new triangle(ts1,ts2,ts3);
		System.out.println("Radiusof the circle"+r);
		System.out.println("Area of the circle"+circle.findarea());
		System.out.println("Perimeter of the circle"+circle.findperimeter());
		System.out.println("Sides of the rectangle:"+rs1+rs2);
		System.out.println("Area of the rectangle"+rectangle.findarea());
		System.out.println("Perimeter of rectangle"+rectangle.findperimeter());
		System.out.println("Sides of triangle:"+ts1+ts2+ts3);
		System.out.println("Area of the triangle"+triangle.findarea());
		System.out.println("Perimeter of triangle"+triangle.findperimeter());
		
	}

}
