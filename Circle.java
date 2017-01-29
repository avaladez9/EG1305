//imported decimal formatter
import java.text.DecimalFormat;
public class Circle {
	public static void main(String[] args)
	{
		int radius = 5;
		int diameter = radius*2; 
		double area = radius*radius*Math.PI; // using class for PI
		//class name is DecimalFormat 
		//object ref. is formatter, can be named anything
		//constructer is DecimalFormat
		DecimalFormat formatter = new DecimalFormat("#0.0000"); // setting decimal precision
		System.out.println("The circle's radius is 5, the area is " + formatter.format(area));// printing solutions with correct formatting 
		System.out.println("The diameter is "+ diameter); 
		
	}

}
