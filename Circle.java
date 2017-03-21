
public class Circle 
{
	private double radius;
	
	public Circle( double r) // constructor
	{
		radius = r;
	}
	public Circle() 
	{
		// TODO Auto-generated constructor stub
	}
	public void setRadius(double rad)
	{
		radius = rad;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	public double getDiameter()
	{
		return radius * 2;
	}
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}

}
