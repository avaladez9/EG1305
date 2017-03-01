import java.util.Scanner; // import scanner class
public class Prime 
{
	public static void main(String[] args)
	{
		isPrime(); // call prime method
	}
	public static void isPrime()  // method to figure out prime numbers
	{
		Scanner keyboard = new Scanner(System.in); //object for input
		
		int num, counter = 0; // hold the user number and variable to keep track of amount of prime numbers

		System.out.println("Enter number. This program will print out all the prime "
				+ "numbers smaller than this number"); // get user number
		num = keyboard.nextInt();
		
		for (int i = 2; i < num; i++) // run through all numbers one by one starting from 2
		{
			 
			boolean prime = true; // boolean value for if statement

			// check to see if the number is prime
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0) // number not prime
				{ 
				prime = false;
				break;
				}
			}
			
			
			if (prime) // if prime print the number
			{
				counter++; // add one to the amount of primes
				System.out.print(i + " ");
				if (counter%10==0){
					System.out.println("");
				}
			}
			
		}
		System.out.print("\nThere are a total of " + counter + " prime numbers."); // print out amount of primes
}
}
