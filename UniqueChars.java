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
		for( int i = 0 ; i<s.length() ; i++)
		{
			char ch = s.charAt(i);
			boolean b = true;
			for( int j = i+1 ; j<s.length() ; j++)
			{
				if(ch == s.charAt(j)&&ch!= 32)
				{
					b = false;
				}
			}
			if(b == true)
				ans = ans + (char)s.charAt(i);
		}
        return ans;
    }
}