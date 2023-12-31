package leetcode;


/**
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 *
 *
 * @author Sharaf Qeshta
 * */
public class Search2DMatrix
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            if (target <= matrix[i][matrix[i].length-1])
            {
                for (int x : matrix[i])
                    if (x == target)
                        return true;
                return false;
            }
        }
        return false;
    }
}
