import java.util.Scanner;
public class MilesPerGallon {
	public static void main(String[] args)
	{
		double miles, gallons, mpg;
		
		// Create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the miles driven
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextInt();

		// Get the gas used
		System.out.print("Enter the gallons of fuel used: ");
		gallons = keyboard.nextInt();
		
		// Calculate MPG
		mpg = miles / gallons;
		
		// Display results
		System.out.print("The miles-per-gallon is " + mpg);
	}

}
