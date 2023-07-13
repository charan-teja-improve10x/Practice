public class FactorialProblems {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++){
            result  = result*= i;
        }
        return result;
    }
}
