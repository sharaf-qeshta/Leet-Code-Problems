package leetcode;


/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise
 *
 * @author Sharaf Qeshta
 * */
public class PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        String stringX = x+"";
        int j = stringX.length()-1;
        for (int i = 0; i < stringX.length(); i++, j--)
            if (stringX.charAt(i) != stringX.charAt(j))
                return false;
        return true;
    }
}
