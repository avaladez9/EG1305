
public class Drink {
	public static void main(String[] args)
	{
		double customer = 12467;
		double citrus;
		customer = customer*.14;
		citrus = customer*.64;
		
		System.out.println("The amount of customers that purchase per week is: " + (int)customer);
		System.out.println("The amount of customers that prefer citrus drinks are: " + (int)citrus);
	}

}
