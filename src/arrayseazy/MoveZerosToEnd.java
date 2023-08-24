package arrayseazy;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 0, 0};
        System.out.println(Arrays.toString(moveZeros(numbers)));
    }

    private static int[] moveZeros(int [] numbers){
        if (numbers == null || numbers.length == 0){
            return new int[]{};
        }
        int n = numbers.length;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (numbers[i] != 0){
                nums.add(numbers[i]);
            }
        }
        int nm = nums.size();
        for (int i = 0; i < nm; i++){
            numbers[i] = nums.get(i);
        }

        for (int i = nm; i < n; i++){
            numbers[i] = 0;
        }
        return numbers;
    }
}
