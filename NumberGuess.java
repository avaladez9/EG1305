import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
	public static void main(String[] args){
		// Objects created for random number and user input
		Random rand = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		// random number generated. 
		int n = rand.nextInt(100) + 1;
		
		// variable to hold user number
		int num = 0;
		
		// variable to control while loop
		boolean win = false;
		
		// ask user for number
		System.out.println("Enter number between 1 and 100");
		num = keyboard.nextInt();
		
		// check to see if user number is within range
		if ((num < 1) || (num > 100))
		{
			System.out.println("Number is out of range.");
			System.out.println("Enter number between 1 and 100: ");
			num = keyboard.nextInt();
		}
		
		// while loop to figure out if guessed number equals random number
		while (win == false)
		{
			if ( num == n)
			{
				System.out.println("You guessed it right");
				// set boolean value equal to true, so that loop will end
				win = true;
			}
			else if ( num < n)
			{
				System.out.println("Guess higher");
				num = keyboard.nextInt();
			}
		
			else
			{
				System.out.println("Guess lower");
				num = keyboard.nextInt();
			}

		}

	}

}
