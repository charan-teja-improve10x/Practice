public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }

    private static boolean isPalindrome(String word) {
        String trimWord = word.trim();
        String reverse = "";
        for (int i = trimWord.length() - 1; i >= 0; i--) {
            reverse += trimWord.charAt(i);
        }
        if (trimWord.length() == 0 || word == null) {
            return false;
        } else if (reverse.equals(trimWord)) {
            return true;
        } else {
            return false;
        }
    }
}
