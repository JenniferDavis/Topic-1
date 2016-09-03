import java.util.*;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Initiate Scanner to read input
		Scanner input = new Scanner(System.in);
		
// Read Input of year
		System.out.print("Enter a year: ");
		int year = input.nextInt();
	
		
// Read Input of month
		System.out.print("Enter the first 3 letters of a month (i.e., \"Jan\"): ");
		String month_string = input.next();
	// convert month to uppercase?  stringvariable.toUpperCase() Returns a new string with all letters in uppercase.
		String month_stringUpperCase = month_string.toUpperCase();		
		
/* check for correct output
		System.out.println("Checking: " + year + " " + month_stringUpperCase);
*/
		
	// declare variable and intialize
		int daysInMonth = 0;
	
	// What about leap years?
		boolean isLeapYear = 
			(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

// Computations
				
	// Which month gives which days
		if (month_stringUpperCase.equals("JAN"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("MAR"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("MAY"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("JUL"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("AUG"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("OCT"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("DEC"))
			daysInMonth = 31;
		if (month_stringUpperCase.equals("SEP"))
			daysInMonth = 30;
		if (month_stringUpperCase.equals("APR"))
			daysInMonth = 30;
		if (month_stringUpperCase.equals("JUN"))
			daysInMonth = 30;
		if (month_stringUpperCase.equals("NOV"))
			daysInMonth = 30;
	
	// Check for Leap Year in Feb
		
		if (month_stringUpperCase.equals("FEB")){
			if (isLeapYear == true)
				month_stringUpperCase = "FEB_LeapYear";
			if (isLeapYear == false)
				month_stringUpperCase = "FEB_noLeapYear";
		}

		if (month_stringUpperCase.equals("FEB_LeapYear"))
			daysInMonth = 29;
		if (month_stringUpperCase.equals("FEB_noLeapYear"))
			daysInMonth = 28;
		
/* check for correct output
		System.out.println("Checking: " + year + " " + month_string.toUpperCase() + " " + daysInMonth);	
*/
		
// Display
		System.out.println(month_string.toUpperCase() + " " + year + " has " + daysInMonth + " days");
			
		
		
	}

}
