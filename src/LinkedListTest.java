import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        testLinkedList();
    }

    private static void testLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Charan Teja");
        list.add("Sukanya");
        list.add("Vijaya");
        list.add("Pullaiah");
        list.add("David");
        list.add("Sunil");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pranathi");
        list.addAll(1,arrayList);
        System.out.println(list);
        int size = list.size() -3;
        for (int i = 0; i < size; i++){
            list.remove(0);
        }
        System.out.println(list);
    }
}
