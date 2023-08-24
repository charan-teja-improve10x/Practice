package strings;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("MALAYALAM", "LLYAAAAMM"));
    }

    private static boolean isAnagram(String str1, String str2){
        if (str1 == null && str2 == null || str1.length() == 0 && str2.length() == 0){
            return  false;
        } else if (str1.length() != str2.length()) {
            return false;
        }

        str1 = sorting(str1);
        str2 = sorting(str2);
        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static String sorting(String name){
        char[] c = name.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
