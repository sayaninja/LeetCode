package numbers.reverseInteger;

import static java.lang.Math.abs;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 * Example 1:
 *      Input: 123
 *      Output:  321
 * Example 2:
 *      Input: -123
 *      Output: -321
 * Example 3:
 *      Input: 120
 *      Output: 21
 */
public class ReverseInteger {
    public static void main(String[] args) {
        reverse(123);
    }

    private static int reverse(int x) {
        boolean isNeg = x < 0;
        if(isNeg) x = 0 - x;
        long result = 0;
        while (x > 0) {
            result = result * 10;
            result = result + x % 10;
            x = x / 10;
        }
        if(result > Integer.MAX_VALUE)
            return 0;
        return isNeg ? (int)(0 - result) : (int)result;
    }
}
