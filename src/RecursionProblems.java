public class RecursionProblems {
    public static void main(String[] args) {
       checkPalindrome("MadaM");
    }

    private static int factorialOfNumbers(int number){
        int result = 0;
        if (number == 0 || number == 1) {
            result =  1;
        }else {
            result = number * factorialOfNumbers(number - 1) ;
        }
        return result;
    }

    private static boolean palindromeChecker(String name) {
        boolean result = false;
        int length = name.length();
        if (length == 0 || length == 1) {
            result =  true;
        }else if ( name.charAt(0) == name.charAt(length -1)){
            String subName = name.substring(1,length-1);
             palindromeChecker(subName);
            result =  true;
        }else {
            result = false;
        }
        return result;
    }

    private static boolean isPalindrome(String name) {
        if (name.length() <= 1) {
            return true;
        } if (name.charAt(0) != name.charAt(name.length() - 1)){
            return false;
        }
        return isPalindrome(name.substring(1, name.length()-1));
    }

    private static void checkPalindrome(String name) {
        if (isPalindrome(name )){
            System.out.println(name + " Is Palindrome");
        } else {
            System.out.println(name + " Not A Palindrome");
        }
    }
}
