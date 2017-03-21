
public class Pet {
	private String name;
	private String type;
	private int age;
	
	public Pet(String n, String t, int a) // consturctor
	{
		name = n;
		type = t;
		age = a;
	}
	public Pet() 
	{
		// TODO Auto-generated constructor stub
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setType(String t)
	{
		type = t;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public int getAge()
	{
		return age;
	}
	
}
