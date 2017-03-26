import java.util.Random;

public class Coin 
{
	private String sideUp = "";

	
	public Coin() // default constructor with no args...sets original side of coin..stores it in sideUp
	{
		toss();
	}
	

	public void toss() // will flip the coin
	{
		Random rand = new Random(); // random object created
		int value = rand.nextInt(2); // stores random value 0-1 in variable value
		
		if (value == 0)
		{
			sideUp = "heads"; // if value is 0, set sideUp to heads
		}
		else
		{
			sideUp = "tails"; // if value is 1, set sideUp to tails
		}
	}
	
	public String getSideUp() // accessor method for coin side
	{
		return sideUp;
	}
	
}
