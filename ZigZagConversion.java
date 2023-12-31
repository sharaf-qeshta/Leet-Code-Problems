package leetcode;

import java.util.Arrays;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows
 * like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 *
 * @author Sharaf Qeshta
 * */
public class ZigZagConversion
{
    public String convert(String s, int numRows)
    {
        String[] helper = new String[numRows];
        Arrays.fill(helper, "");
        int row = 0;
        int delta = 1;
        for (int i = 0; i < s.length(); i ++)
        {
            char c = s.charAt(i);
            helper[row] += c;
            if (row == numRows - 1)
                delta = -1;
            else if (row == 0)
                delta = 1;
            row = row + delta;
            row = Math.max(0, row);
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows && !s.isEmpty(); i ++)
            result.append(helper[i]);
        return result.toString();
    }
}
