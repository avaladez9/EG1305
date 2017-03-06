import java.util.Scanner;
import java.util.Random;

public class GeneratePassword
{
	public static void main(String[] args)
	{
		random(); // calls random method
	}
	public static void random()
	{
		int num, password = 0; // variables to hold user number, and password
		
		Scanner input = new Scanner(System.in); // scanner object
		
		Random randomNumber = new Random();	// random object
		
		System.out.println("How many digits would you like to use" // get user number
				+ " for a numeric password: ");
		num = input.nextInt();
		
		if (num <= 0) // check to see if user input is valid
		{
			System.out.println("Enter a number greater than 0: ");
		
			num = input.nextInt();
		
		}
		
		int n = 1; // primer
		
		System.out.println("Your password is:");
		
		while (n <= num) // generates random numbers for given amount
		{
			password = randomNumber.nextInt(10); // random number 0-9
			
			System.out.print( password + " "); // display password
			
			n++;
		}
		
	
	}
	
}
