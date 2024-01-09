/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		isLeapYearTest(year);
		nDaysInMonthTest(year,month);
	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year, int month) {
		// Replace this comment with your code
		System.out.println(nDaysInMonth(year,month));
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) 
	{
		Boolean test =  false;
		if(year%400==0||year%4==0)
			test = true;
		return test;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) 
	{
			if(isLeapYear(year)&&month == 2)
				return 29;
			if(month==2)
				return 28;
			if((month%2==1)&&month!=9 && month!=11)
				return 31;
			if(month == 4 || month == 6)
				return 30;
			if((month%2==0))
				return 31;
			return 30;

	}
}
