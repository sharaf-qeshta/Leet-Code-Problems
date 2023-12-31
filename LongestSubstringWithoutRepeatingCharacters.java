package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s, find the length of the longest
 * substring
 *  without repeating characters.
 *
 * @author Sharaf Qeshta
 * */
public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s)
    {
        Map<Character,Integer> map = new HashMap();
        int start = 0;
        int maxLength = 0;
        for(int end = 0; end < s.length(); end++)
        {
            char rightChar = s.charAt(end);
            if(map.containsKey(rightChar))
                start = Math.max(start,map.get(rightChar)+1);
            map.put(rightChar,end);
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}
