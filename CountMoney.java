import java.util.Scanner;

public class CountMoney {
	public static void main(String[] args)
	{
		int amount, dollars, cents, quaters, dimes, nickels, pennies;
		
		// Create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the money
		System.out.print("Enter an amount in integer, for example 1156" + 
						" for 11 dollars and 56 cents: "	);
		amount  = keyboard.nextInt();
		
		// Use division to get dollar amout
		dollars = amount / 100;
		
		// Use modulus to get cents
		cents = amount % 100;
		
		// get quaters
		quaters = cents / 25;
		
		// get dimes
		dimes = (cents % 25) / 10;
		
		// get nickels
		nickels = (cents % 25) % 10 / 5;
		
		// get pennies
		pennies = (cents % 10) % 5 / 1;
		// Print out results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(dollars + " \tdollars");
		System.out.println(quaters + " \tquaters");
		System.out.println(dimes + " \tdimes");
		System.out.println(nickels + " \tnickels");
		System.out.println(pennies + " \tpennies");
	
	}

}
