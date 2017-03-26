
public class Fan 
{
	private int speed = 0;
	private boolean fanStatus = false;
	private String fanOF = "";
	private double radius = 5;
	private String color = "blue";
	
	public Fan()
	{
		
	}
	public Fan(int s, boolean f, double r, String c)
	{
		speed = s;
		fanStatus = f;
		if (fanStatus == true)
		{
			fanOF = "on";
		}
		else if (fanStatus == false)
			fanOF = "off";
		radius = r;
		color = c;
	}
	public String toString()
	{
		return "The fan speed is " + speed + ", the radius is " + radius + 
				". The fan's color is " + color + ", and the fan is " + fanOF + ".";
	}
	
}
