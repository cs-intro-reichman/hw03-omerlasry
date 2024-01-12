public class Calendar {
    static int year = 1900;
    static int nDaysInMonth = 31; // Number of days in January
    static int dayOfMonth = 1;
    static int month = 1;
    static int dayOfWeek = 2; // 1.1.1900 was a Monday
    static int SundaysCount = 0;
    static boolean isSunday;

    public static void main(String args[]) {
        int GivenYear = Integer.parseInt(args[0]);
        while (year <= GivenYear) {
            if (year == GivenYear) {
                if (dayOfWeek != 1) {
                    System.out.println(dayOfMonth + "/" + month + "/" + year);
                } else {
                    System.out.println(dayOfMonth + "/" + month + "/" + year + " " + "Sunday");
                }
            }
            advance();
        }
    }
	
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