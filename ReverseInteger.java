package leetcode;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range
 * [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 * @author Sharaf Qeshta
 * */
public class ReverseInteger
{
    public int reverse(int x)
    {
        long sum=0;
        int k=x;
        if(x<0)
            k=(-1)*k;
        while(k>0)
        {
            sum=sum*10+x%10;
            x=x/10;
            k=k/10;
        }
        if(sum < -2147483648L || sum > 2147483648L)
            return 0;
        else
            return (int)sum;
    }
}
