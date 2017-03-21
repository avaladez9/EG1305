
public class Chess2 {
	public static void main(String[] args) 
	{
		int squares = 63;
		int counter;
		double rice = 1;
		
		counter = 1;
		double total = 0;

		while (counter <= squares) 
		{
			rice = rice * 2;
			total = total + rice;
			counter++;
		}
		
		System.out.println("Amount of rice on the last square " + rice);
		System.out.println("Total amount of rice: " + total);

		}
}

