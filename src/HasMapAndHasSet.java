import java.util.HashMap;
import java.util.HashSet;

public class HasMapAndHasSet {
    public static void main(String[] args) {
        practiceHasMap();
        practiceHasSet();
    }

    private static void practiceHasMap() {
        HashMap<Integer, String> map = new HashMap();
        map.put(1 , " Charan Teja");
        map.put(2 , " Sukanya");
        map.put(3 , " Sudaa");
        map.put(4 , " Suresh");
        map.put(5 , " Prakash");
        System.out.println(map.get(5));
        System.out.println(map.containsKey(8));
        System.out.println(map.replace(3, " Sudaa", " Sudha Rani"));
        for (Integer number: map.keySet()) {
            String value = map.get(number);
            System.out.println(number + " : " + value);
        }
        System.out.println();
    }

    private static void practiceHasSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Grapes");
        set.add("Apple");

        for (String element: set) {
           System.out.println(element);
        }
        System.out.println(set);
        System.out.println(set.size());
        set.remove("Apple");
        System.out.println(set);
    }
}
