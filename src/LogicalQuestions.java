public class LogicalQuestions {
    public static void main(String[] args) {
        //  System.out.println(sumIsLessThanHundred(555,44));
        // System.out.println(numberIsDivisibleWithFive(2012));
        //System.out.println(fizzBuff(31));
        //swappingTwoNumbers(5, 6);
    }

    private static boolean sumIsLessThanHundred(int a, int b) {
      boolean result = false;
      if (a + b <= 100) {
          result =  true;
      } else {
          result = false;
      }
      return result;
    }

    private static boolean numberIsDivisibleWithFive (int number) {
        boolean result = false;
        if (number % 5 == 0) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    private static String fizzBuff(int number) {
        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FIZZ BUZZ";
        } else if (number % 5 == 0) {
            result = "BUZZ";
        } else if (number % 3 == 0) {
            result = "FIZZ";
        }else {
            System.out.println(number);
        }
        return  result;
    }

    private static boolean twoMakesTen(int num, int number) {
        boolean result = false;
        return result;
    }

    private static void swappingTwoNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a +  "," + b);
    }
}
