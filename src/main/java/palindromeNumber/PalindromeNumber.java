package palindromeNumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(1221));
        System.out.println(new PalindromeNumber().isPalindrome(12321));
        System.out.println(new PalindromeNumber().isPalindrome(123221));
        System.out.println(new PalindromeNumber().isPalindrome(-2147447412));
    }

    public boolean isPalindrome(int number) {
        if(number < 0) {
            return false;
        }
        return number == reverse(number);
    }

    private static long reverse(int x) {
        long result = 0;
        while (x > 0) {
            result = result * 10;
            result = result + x % 10;
            x = x / 10;
        }
        return result;
    }
}
