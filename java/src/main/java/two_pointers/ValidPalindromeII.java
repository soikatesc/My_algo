package two_pointers;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validSubPalindrome(s, left + 1, right)
                        || validSubPalindrome(s, left, right - 1);
            }

            left ++;
            right --;
        }
        return true;
    }

    public static boolean validSubPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        validPalindrome(s);
    }
}
