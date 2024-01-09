/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) 
	{
        // Replace the following statement with your code
		String ans = "" ;
		boolean test = true;
		ans = ans +s.charAt(0);
		for(int i = 1 ; i<s.length() ;i ++)
		{
			test = true;
			char ch = s.charAt(i);
			for(int j = 0 ; j <ans.length() ; j++)
			{
				if(ch == ans.charAt(j)&&ch!=32)
					test = false;

			}
			if(test == true)
				ans = ans + (char)s.charAt(i);
		}
        return ans;
    }
}