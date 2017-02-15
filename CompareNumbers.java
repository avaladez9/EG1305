import java.util.Scanner; // Needed for scanner class
public class CompareNumbers {
	public static void main(String[] args){
		// scanner object to read input 
		Scanner keyboard = new Scanner(System.in);
		
		int num1, num2, num3, sum, product, average; // holds numbers
		// get numbers
		System.out.print("Enter first integer: ");
		num1 = keyboard.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = keyboard.nextInt();
		
		System.out.print("Enter third integer: ");
		num3 = keyboard.nextInt();
		
		// display numbers first
		System.out.println("For the numbers " + num1 + ", " + num2 + " and " + num3);
		
		// find out which number is largest and display
		if ( (num1 > num2) && (num1 > num3))
		{
			System.out.println("Largest number is " + num1);
		}
		else if ((num2 > num1) && (num2 > num3))
		{
			System.out.println("Largest number is " + num2);
		}
		else if ((num3 > num1) && (num3 > num2))
		{
			System.out.println("Largest is " + num3);
		}
		// find out which number is smallest and display
		if ((num1 < num2) && (num1 < num3))
		{
			System.out.println("Smallest is " + num1);
		}
		else if ((num2 < num1) && (num2 < num3))
		{
			System.out.println("Smallest is " + num2);
		}
		else if ((num3 < num1) && (num3 < num2))
		{
			System.out.println("Smallest is " + num3);
		}
		
		// calculate sum product and average, then display results
		sum = num1 + num2 + num3;
		System.out.println("Sum is " + sum);
		
		product = num1 * num2 * num3;
		System.out.println("Product is " + product);
		
		average = (num1 + num2 + num3) / 3;
		System.out.print("Average is " + average);
		
	}
	
}
