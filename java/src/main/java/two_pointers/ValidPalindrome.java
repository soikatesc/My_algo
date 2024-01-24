package two_pointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String newStr = sb.toString();

        int left = 0;
        int right = newStr.length() - 1;

        while (left <= right) {
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        obj.isPalindrome("A man, a plan, a canal: Panama");
    }
}
