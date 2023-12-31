package leetcode;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively,
 * return the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 * @author Sharaf Qeshta
 * */
public class MedianOfTwoSortedArrays
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] merged = new int[nums1.length + nums2.length];
        int j = 0, k = 0;
        for (int i = 0; i < merged.length; i++)
        {
            if (j < nums1.length && k < nums2.length)
            {
                if (nums1[j] <= nums2[k])
                    merged[i] =nums1[j++];
                else
                    merged[i] = nums2[k++];
            }
            else if (j < nums1.length)
                merged[i] = nums1[j++];
            else
                merged[i] = nums2[k++];
        }

        int index = merged.length / 2;
        if (merged.length % 2 == 0)
            return (merged[index] + merged[index-1]) / 2.0;
        return merged[index];
    }
}
