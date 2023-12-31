package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * @author Sharaf Qeshta
 * */
public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> output = new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs)
        {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String key = new String(sortedChars);

            if (map.containsKey(key))
                map.get(key).add(s);
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        for (String key : map.keySet())
            output.add(map.get(key));
        return output;
    }
}
