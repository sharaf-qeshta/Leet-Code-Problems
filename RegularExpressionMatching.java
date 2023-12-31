package leetcode;

/**
 * Given an input string s and a pattern p, implement regular expression matching with support for
 * '.' and '*' where:
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 *
 * @author Sharaf Qeshta
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p)
    {
        if (p.isEmpty())
            return s.length() == 0;

        if (p.length() > 1 && p.charAt(1) == '*')
        {
            if (isMatch(s, p.substring(2)))
                return true;
            if (s.length() > 0 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)))
                return isMatch(s.substring(1), p);

            return false;
        }
        else
        {
            if (s.length() > 0 && (p.charAt(0) == '.'
                    || s.charAt(0) == p.charAt(0)))
                return isMatch(s.substring(1), p.substring(1));

            return false;
        }
    }
}
