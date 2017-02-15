import java.util.Random; // needed for the random class
import java.util.Scanner;	// needed for the scanner class
public class PaperRockScissors {
	public static void main(String[] args){
		// random object to generate random numbers
		Random rand = new Random();
		
		// scanner object to red input
		Scanner keyboard = new Scanner(System.in);
		
		// generates a random
		int  n = rand.nextInt(2) + 0; // max number is 2..min number is 0
		
		// get choice from user
		System.out.print("scissors(0), rock (1), paper (2): ");
		int num = keyboard.nextInt();
		
		// figure out who won
		if ((num == 0) && (n == 2))
		{
			System.out.println("You won: scissors beats paper");
		}
		else if ((num == 1) && (n == 0))
		{
			System.out.println("You won: rock beats scissors");
		}
		else if ((num == 2) && (n == 1))
		{
			System.out.println("You won: paper beats rock");
		}
		else if ((num == 0) && (n == 1))
		{
			System.out.println("You lost: rock beats scissors");
		}
		else if ((num == 1) && (n == 2))
		{
			System.out.println("You lost: paper beats rock");
		}
		else if ((num == 2) && (n == 0))
		{
			System.out.println("You lost: scissors beats paper");
		}
		else if (num == n) // if computer number equals user number
		{
			System.out.println("It was a tie!");
		}
		else // check for invalid input
		{
			System.out.println("Invalid number");
		}
	}
}
