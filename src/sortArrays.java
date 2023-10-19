import java.util.Arrays;

public class sortArrays {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 3, 2, 5, 4, 6};
        System.out.println(Arrays.toString(sortArrays(numbers)));
    }

    private static int[] sortArrays(int[] numbers){
        if (numbers== null || numbers.length == 0){
            return new int[]{};
        }else {
            Arrays.sort(numbers);
            return numbers;
        }
    }
}
