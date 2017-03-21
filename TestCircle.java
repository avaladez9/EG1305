import java.util.Scanner;
import java.text.DecimalFormat;
public class TestCircle 
{
	public static void main(String[] args)
	{
		// create a circle object and assign its address to the big variable
		Circle c1 = new Circle();
		DecimalFormat formatter = new DecimalFormat("0.0000");
		Scanner in = new Scanner(System.in);
		double radius;
		System.out.print("Please enter the radius: ");
		radius = in.nextDouble();
		
		c1.setRadius(radius);
		
		System.out.print("The circle's radius is: " + formatter.format(c1.getRadius()) + "\n");
		System.out.print("The circle's diameter is: " + formatter.format(c1.getDiameter()) + "\n" );
		System.out.print("The circle's area is: " + formatter.format(c1.getArea()) + "\n");
		System.out.print("The circle's circumference is: " + formatter.format(c1.getCircumference()));
	}
}
