import java.text.DecimalFormat;
public class TestAccount 
{
	public static void main(String[] args)
	{
		Account a = new Account(1122, 20000, 4.5); // object created passing 3 arguments, creating account.
		
		DecimalFormat format = new DecimalFormat("00,000.00"); // object created to format balance.
		
		
		a.withdraw(2500); // a object invokes the withdraw method, passing $2500 
		
		a.deposit(3000); // a object invokes the deposit method, passing $3000
		
		
		System.out.print("The balance is $" + format.format(a.getBalance()) + "\n"); // prints out the new balance
		System.out.print("The monthly interest is " + a.getMonthlyInterestRate() + "%\n"); // prints out the monthly interest
		System.out.print("This account was created on " + a.getDateCreated()); // prints out the date the account was created
	}
}
