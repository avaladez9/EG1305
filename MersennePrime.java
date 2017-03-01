import java.util.Scanner;
public class MersennePrime 
{
	public static void main(String[] args)
	{
		isMersenne(); // call the mersenne method
	}
	public static void isMersenne() // method to figure out if number is mersenne prime
	{ 
		Scanner keyboard = new Scanner(System.in);
		int num, counter = 0; // variables to hold user number, and to keep track of amount of mersenne numbers
		
		System.out.println("Enter a number. This program will print all the Mersenne "
				+ "prime numbers smaller than this one. "); // get user number
		num = keyboard.nextInt();
		
		for (int i = 2; i < num; i++) // run through numbers to see if prime
		{ 
			 
			boolean prime = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) 
			{
					if (i % j == 0) 
					{
					prime = false;
					break;
					}
			}
			
			
			if (prime) // if its prime, now check to see if its mersenne prime
			{
				
					for (int s = 1; s<= num; s++) // run through the numbers one by one
					{
			
						if (i == Math.pow(2, s) - 1) // determines if prime number is mersenne or not
						{
							counter++; // add one to amount of mersenne numbers
							System.out.print(i + " "); // print out mersenne prime
						}
					}
			}
			
		}	
			System.out.print("\nThere are a total of " + counter + " Mersenne prime numbers"); // print out total mersenne
	}
	
}
