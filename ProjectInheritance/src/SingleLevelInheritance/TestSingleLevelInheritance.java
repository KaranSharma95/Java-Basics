package SingleLevelInheritance;
/*
class Shape
{
	double getArea() {
		return 0.0;
	}
	double getParameret() {
		return 0.0;
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	double getParameter() 
	{
		return 2*3.14*radius;
	}
	double getArea()
	{
		return 3.14*radius*radius;
	}
	
}

public class TestSingleLevelInheritance {

	public static void main(String[] args) {
		Circle c=new Circle(2.0);
		System.out.println("the perimeter is:"+c.getParameter());
		System.out.println("the area is:"+c.getArea());

	}

}
*/

class a
{
	int i=10;
	//static int j=9;
}
class b extends a
{

	int i=20;
}
public class TestSingleLevelInheritance
{
	public static void main(String args[])
	{
		a a=new b();
		System.out.println(a.i);
	}
}