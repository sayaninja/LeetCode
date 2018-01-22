package numbers.romanToInt;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 *
 * I	1
 * V	5
 * X	10
 * L	50
 * C	100
 * D	500
 * M	1000
 */
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("DCXXI"));
    }

    private static int romanToInt(String s) {
        Map<Character, Integer> romansToInt = new HashMap<>();
        romansToInt.put('I',1);
        romansToInt.put('V',5);
        romansToInt.put('X',10);
        romansToInt.put('L',50);
        romansToInt.put('C',100);
        romansToInt.put('D',500);
        romansToInt.put('M',1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value1 = romansToInt.get(s.charAt( i));

            if(i+1 < s.length()) {
                int value2 = romansToInt.get(s.charAt(i+1));
                if(value1 >= value2) {
                    result += value1;
                } else {
                    result = result + value2 - value1;
                    i++;
                }
            } else {
                result = result + value1;
                i++;
            }
        }

        return result;
    }
}
