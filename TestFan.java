import java.util.Scanner;
public class TestFan 
{
	public static void main(String[] args)
	{
		int speed;
		double radius;
		String status;
		
		String color;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the speed of the fan? ");
		speed = in.nextInt();
		
		System.out.println("What is the radius of the fan? ");
		radius = in.nextDouble();
		
		System.out.println("The fan is on? true or false? ");
		status = in.next();
	
		boolean stat = Boolean.parseBoolean(status);
		
		System.out.println("What is the color of the fan? ");
		color = in.next();
		
		Fan f = new Fan(speed, stat, radius, color);
		
		System.out.println(f.toString());
		
	}
}
