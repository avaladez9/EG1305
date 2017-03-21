import java.util.Scanner;

public class Distance {
public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);
	
	int x1, y1, x2, y2;
	
	System.out.print("Enter x value for first point: ");
	x1 = keyboard.nextInt();
	System.out.print("Enter y value for first point: ");
	y1 = keyboard.nextInt();
	System.out.print("Enter x value for second point: ");
	x2 = keyboard.nextInt();
	System.out.print("Enter y value for second point: ");
	y2 = keyboard.nextInt();
	
	System.out.print("The distance between the two points is: " +  getDistance(x1,y1,x2,y2));
	
}
public static double getDistance(double x1, double y1, double x2, double y2)
{
	return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	
}
}
