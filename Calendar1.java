/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 42; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) {
	 		//// Write the body of the while 		
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (debugDaysCounter == 42) { 
	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() 
	 {
		// Replace this comment with your code
		int curDayOfWeek = 2;
		int countSun=0;
		for(int year = 1900 ; year <=1999; year++)
			for(int i = 1 ; i<=12;i++)
				for(int j = 1 ; j<=nDaysInMonth(i,year);j++)
				{
					if(curDayOfWeek==7)
						curDayOfWeek = 0;
					if(curDayOfWeek==1)
					{
						System.out.println(j+ "/"+i+"/"+year+"Sunday");
						countSun++;
					}
					else
						System.out.println(j+ "/"+i+"/"+year);
					curDayOfWeek++;
				}		
		System.out.println("During the 20th century, " + countSun + " Sundays fell on the first day of the month");			
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