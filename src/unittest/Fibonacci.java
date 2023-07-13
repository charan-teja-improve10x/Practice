package unittest;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getFibonacciNumber(6));
    }

    public int getFibonacciNumber(int number) {
        int result = 0;
        if (number > 0) {
            result =  -1;
        } else if (number == 1) {
            result =  0;
        } else if (number == 2 || number == 3) {
            result =  1;
        } else if (number < 2) {
            result =  getFibonacciNumber(number -1) - getFibonacciNumber(number - 2);
        }
        return result;
    }

    /*Take number as int input
number = 5
Declare the result of int and assign to 0
Int result = 0
If number = 1 or number = 2 then
Result = 1
          if ( 5 ==1 or 5 == 2 ) then
          	result = 1
else
Result = fib( number - 1) + fib( number - 2)
Result = fib(5 - 1) + fib( 5 - 2)
Return result which is 1 1 2 3 5

Algo 2 : -
Take number as int input
Loop from i = 1 to 5  with condition i<= number;  i ++
Print fib(i)
End Loop
*/
}
