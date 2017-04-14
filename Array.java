

import java.util.Arrays;
import java.util.Scanner;
public class Array {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		// get the length of array from user and store it in the variable num
		System.out.println("How many numbers would you like to store: ");
		
		int num = in.nextInt();
		
		// create the array based off the length num
		int[] array1 = new int[num];
		
		getValues(array1);
		
		System.out.println("The sum is: " + showTotal(array1));
		
		System.out.println("The max number is: " +  showHighest(array1));
		
		System.out.println("The min number is: " + showLowest(array1));
		
		System.out.println("The average is: " + showAverage(array1));
		
	}
		
	// this method gets and stores the values for the array from the user.
	  public static void getValues(int[] array)
	  {
		for (int i = 0; i < array.length; i++)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number:");
			
			array[i] = in.nextInt();
		}
	  }
	  
		// this method gets the highest value in the array
	  public static int showHighest(int[] array)
		{
			int maxValue = array[0];
			// loop through the array and compare each value store and return maxValue
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] > maxValue)
				{
					maxValue = array[i];
				}
			}
			return maxValue;
		}
	
		// this method gets the lowest number in the array
	public static int showLowest(int[] array)
	{
		int minValue = array[0];
		// loop through the array and compare each value, store and return minValue
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < minValue)
			{
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	// this method shows the total of the numbers in the array
	public static int showTotal(int[] array)
	{
		int total = 0;
		for (int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		return total;
	}
	
	// this method shows the average of the array numbers
	public static double showAverage(int[] array)
	{
		int sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
			average = sum / array.length;
		}
		return average;
	}
		// this method displays the array
	
	

}

