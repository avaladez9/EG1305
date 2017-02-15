import java.util.Scanner; // Needed for Scanner class
public class DaysInMonth {
	public static void main(String[] args){
		// Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		int year; // to hold year
		int month; // to hold month
		// Get the year
		System.out.print("Enter the year: ");
		year = keyboard.nextInt();
		// Get the month
		System.out.print("Enter the month: ");
		month = keyboard.nextInt();
		// determine if year is a leap year or not
		boolean leap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		// switch to control how many days are in the month use supplied
		switch (month)
		{
		case 1:
		case 3:
        case 5:    // no breaks needed until case 12
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("There are 31 days in " + month + "/" + year);
        	break;
        case 6:
        case 4:		// no break until case 11
        case 9:
        case 11:
        	System.out.println("There are 30 days in " + month + "/" + year);
        break;
        case 2:
        	if (leap == true)	// if it is leap year, month days go up by one
        	{
        		System.out.print("There are 29 days in " + month + "/" + year);
        	}
        	else	// if not leap year just regular month
        	{
        		System.out.print("There are 28 days in " + month + "/" + year);
        	}
        break;
        default: // to include invalid input
        	System.out.println("Invalid date");
        
		}
}
	
}