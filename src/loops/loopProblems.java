package loops;

import java.util.Arrays;

public class loopProblems {
    public static void main(String[] args) {
//        printNumbers();
//        printTable(5);
//        findLargeNumberInArray();
//        int[] numbers = {2, 10, 33, 1, 15, 0, 222, 333, 334, 5};
//        System.out.println(differenceBetweenMaxAndMin(numbers));
//        System.out.println(printLargeNumberINAnArray(numbers));
    }

    private static void printNumbers() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    private static void printTable(int j) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(j + " * " + i + " = " + j * i);
        }
    }

    private static void findLargeNumberInArray() {
        int[] numbers = {2, 3, 1, 32, 100, 220, 30};
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.stream(numbers).min());
    }

    private static int differenceBetweenMaxAndMin(int[] numbers) {
        int difference = 0;
        try {
            int max = numbers[0];
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            difference = max - min;
            return difference;
        } catch (Exception e) {
            return -1;
        }
    }

    private static int printLargeNumberINAnArray(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
