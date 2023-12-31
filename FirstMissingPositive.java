package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 * @author Sharaf Qeshta
 * */
public class FirstMissingPositive
{
    public int firstMissingPositive(int[] nums)
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
        {
            if (num > 0)
                set.add(num);
        }
        if (!set.contains(1))
            return 1;

        int i;
        for (i = 1; set.contains(i); i++);
        return i;
    }
}
