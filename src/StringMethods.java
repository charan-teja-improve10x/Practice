public class StringMethods {

    public static void main(String[] args) {
        stringMethods();
        practiceStringBuilder();
        practiceStringBuffer();
        System.out.println(swappingTwoStrings("Charan", "Sukanya "));
    }

    private static void stringMethods() {
        String name = "Charan ";
        System.out.println(name.length());
        String name1 = name.concat("Kumar");
        String string = name1.replace("Kumar", "Teja");
        System.out.println(string);
        System.out.println(string.startsWith("C"));
        System.out.println(string.endsWith("j"));
        System.out.println(string.indexOf(" "));
        for (int i = string.length()-1; i >= 0; i--){
            string.charAt(i);
        }
    }

    private static void practiceStringBuilder() {
        StringBuilder name = new StringBuilder();
        name.append("Charan ");
        name.append("Sukanya");
        name.append("ss2");
        System.out.println(name.reverse());
        System.out.println(name.capacity());
    }

    private static void practiceStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer("Charan");
        stringBuffer.append(" Teja");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.capacity());
    }

    private static String swappingTwoStrings(String priffix, String suffix) {
        String result = "";
        priffix = priffix + suffix;
        int length1 = priffix.length();
        int length2 = suffix.length();
        int endLength = length1 - length2;
        suffix = priffix.substring(0,endLength);
        priffix = priffix.substring(endLength);
        result = priffix + suffix;
        return result;
    }
}
