/**
 * This program creates a user array. Lets the user enter the array length, and the values
 * for the array. Then the array is printed, as well as the average, max and min of the array.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Numbers {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int sum = 0, max = 0, min = 0; 
									// these values will hold the sum of array, max, min and average
		double average = 0;
		
		// get the length of array from user and store it in the variable num
		System.out.println("How many numbers would you like to store: ");
		
		int num = in.nextInt();
		
		// create the array based off the length num
		int[] array1 = new int[num];
		
		// loop to add user numbers to array
		for (int i = 0; i < array1.length; i++)
		{
			System.out.println("Enter number: ");
			
			array1[i] = in.nextInt();
			
			// get the average of the array
			sum += array1[i];
			
			average = sum / array1.length;
		}
		
		// call max and min methods, passing the array1 to method
		max = getMax(array1);
		
		min = getMin(array1);
	
		// prints out all the info
		System.out.println(Arrays.toString(array1));
		
		System.out.println("The average is: " + average);
		
		System.out.println("The max number is: " + max);
		
		System.out.println("The min number is: " + min);
		
	}
		// this method will determine the max number
	public static int getMax(int[] array)
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
	
		// this method will determine the min number
	public static int getMin(int[] array)
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
	

}


