package leetcode;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so
 * that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * You must solve this problem without using the library's sort function.
 *
 * @author Sharaf Qeshta
 * */
public class SortColors
{
    public void sortColors(int[] nums)
    {
        int[] count = new int[3];
        for (int x : nums)
            count[x] += 1;
        int index = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < count[i]; j++)
                nums[index++] = i;
        }
    }
}
