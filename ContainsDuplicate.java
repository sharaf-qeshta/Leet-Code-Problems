package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * @author Sharaf Qeshta
 * */
public class ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int x : nums)
            set.add(x);

        return nums.length != set.size();
    }
}
