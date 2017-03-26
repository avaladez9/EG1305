import java.util.Date;
public class Account 
{
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private String dateCreated = "";
	public Account()
	{
		
	}
	public Account(int i, double b, double a)
	{
		id = i;
		balance = b;
		annualInterestRate = a;
	
	}
	public void setId(int i)
	{
		id = i;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public void setAnnualInterestRate(double a)
	{
		annualInterestRate = a;
	}
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	public String getDateCreated()
	{
		Date date = new Date();
		dateCreated =  date.toString();
		return dateCreated;
	}
	public void withdraw(double w)
	{
		balance -= w;
	}
	public void deposit(double d)
	{
		balance += d;
	}
	
}
