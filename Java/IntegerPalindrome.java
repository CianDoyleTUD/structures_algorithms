
/*
OBJECTIVE: Given an integer, find out if it is a palindrome. 
A palindrome is the same when written backwards.
111 is a palindrome
100 is not a palindrome as it turns to 001
Negative numbers are also not palindromes i.e -121 -> 121-
*/

public class IntegerPalindrome 
{

    public static boolean isPalindrome(int x)
    {
        String intStr = String.valueOf(x);
        String reverse = "";
        
        for(int i = intStr.length() - 1; i >= 0; i--)
        {
            reverse = reverse + intStr.charAt(i);
        }

        return reverse.equals(intStr) ? true : false;
    }

    public static void main(String[] args)
    {
        System.out.println(isPalindrome(111));
        System.out.println(isPalindrome(112));
        System.out.println(isPalindrome(-111));
    }
}