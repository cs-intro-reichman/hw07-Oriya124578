/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
        int length = s.length();

       if (length == 0) {
            return true;
        }
        
        if (length == 1) {
            return true;
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(length - 1);

        if (firstChar != lastChar) {
            return false;
        }
        String remainingString = s.substring(1, length - 1);

        boolean result = isPalindrome(remainingString);
        
        return result;
    }
}