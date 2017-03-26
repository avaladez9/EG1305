
public class TestCoin 
{
	public static void main(String[] args)
	{
		Coin c = new Coin(); // coin object
		
		int numOfTosses = 20; // variable used to for loop
		
		System.out.println("The initial side of the coin is " + c.getSideUp()); // initial side of coin
		
		int hCount = 0; // heads counter
		
		for (int i = 0; i < numOfTosses; i++) // for loop to flip coin 20 times
		{
		
			c.toss(); // calling toss method
	
		System.out.println(c.getSideUp()); // prints the side every flip
		
		if ("heads".equals(c.getSideUp())) // compares string to see see if sideUp is heads
		{
		hCount++;  // if sideup is heads, then add 1 to heads counter
		}
		
		}
		System.out.print("Amount of times heads was picked: " + hCount + "\n");
		System.out.print("Amount of times tails was picked: " + (numOfTosses - hCount)); // displays tails count
		
	
		
	}
}
