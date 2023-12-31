package leetcode;

import java.util.Arrays;

/**
 * You are given an integer array arr. Sort the integers in the array in ascending order
 * by the number of 1's in their binary representation and in case of two or more integers
 * have the same number of 1's you have to sort them in ascending order.
 * Return the array after sorting it.
 *
 * 
 * @author Sharaf Qeshta
 * */
public class SortIntegersByTheNumberOf1Bits
{
    public int[] sortByBits(int[] arr)
    {
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, (a, b) ->
        {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countA == countB ? a - b : countA - countB;
        });
        return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
    }
}
