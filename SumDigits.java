import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args)
	{
		int num, one, two, third, sum;
		// Create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		// Get the number from user
		System.out.print("Enter an integer between 0 and 1000: ");
		num = keyboard.nextInt();
		
		// Get each digit
		one = num % 10;
		two = (num / 10) % 10;
		third = (num / 100) % 10;
		
		// Sum digits
		sum = one + two + third;
		
		// Display digits
		System.out.print("The sum of all digits in " + num + " is " + sum);
	}

}
