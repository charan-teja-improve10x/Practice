package strings;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println(reverseWord("Charan Teja   Sukanya   "));
    }

    public static String reverseWord(String word){
        if (word == null || word.isEmpty()){
            return "";
        }
        String[] words = word.trim().split("\\s+");
        StringBuilder reverseWord = new StringBuilder();
        for (int i = words.length -1; i >= 0; i--){
            reverseWord.append(words[i]);
            if (i > 0){
                reverseWord.append(" ");
            }
        }

        return reverseWord.toString();
    }
}
