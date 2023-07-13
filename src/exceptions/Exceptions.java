package exceptions;

public class Exceptions {
    public static void main(String[] args) throws CustomeException {
        try {
            System.out.println(division(2,0));
        }catch (CustomeException e) {
            System.out.println( "An Error Occurred : " +  e.getMessage());
        }
//        handleArithmeticException(10, 0);
//        System.out.println(covertStringIntoInt("10"));
//        System.out.println(covertStringIntoInt("cha"));
//        System.out.println(covertStringIntoInt("200"));
//        System.out.println(covertStringIntoInt("20"));
//        System.out.println(covertStringIntoInt("2000"));
//        System.out.println(covertStringIntoInt("200000"));
//        int[] numbers = {200, 2000, 20, 300, 1, 2, 10};
//        System.out.println(handleArrayOutOfBoundsException(numbers, numbers.length - 1));
//        System.out.println(handleArrayOutOfBoundsException(numbers, numbers.length));
//        System.out.println(handleArrayOutOfBoundsException(numbers, 5));
//        System.out.println(handleArrayOutOfBoundsException(numbers, 3));
//        System.out.println(handleArrayOutOfBoundsException(numbers, 0));
    }

    private static int division(int a, int b) throws CustomeException {
       if ( a == 0 || b == 0){
           throw new CustomeException("Division By Zero Is Not Allowed Please enter a Correct NUmber");
       }else {
           int result = a / b;
           return result;
       }
    }

    private static int covertStringIntoInt(String number) {
        try {
            int num = Integer.parseInt(number);
            return num;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number " + e.getMessage());
            return -1;
        }
    }

    private static int handleArrayOutOfBoundsException(int[] numbers, int index) {
        try {
            return numbers[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds : " + e.getMessage());
            return -1;
        }
    }

}
