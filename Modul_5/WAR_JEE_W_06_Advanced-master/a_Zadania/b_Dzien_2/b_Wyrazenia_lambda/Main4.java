/*
1. Napisz interfejs funkcyjny, który pozwoli na obliczenie kwadratu i pierwiastka dowolnej liczby zmiennoprzecinkowej oraz silni liczby całkowitej.
2. Napisz wyrażenia lambda korzystające z tego interfejsu.
 */

package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Function;
import java.util.stream.LongStream;

public class Main4 {

    public static void main(String[] args) {

        MathOperation square = (integer) -> integer * integer;

        Function<Integer, Double> squareRoot = Math::sqrt;

        MathOperation factorial = (integer) -> {
            int result = 1;
            for(int i = 1; i <= integer; i++)
                result = result * i;
            return result;
        };

        MathOperation factorialJava8 = integer -> LongStream.rangeClosed(1, integer)
                .reduce(1, (long x, long y) -> x * y);

        System.out.println(square.operation(4));
        System.out.println(squareRoot.apply(16));
        System.out.println(factorial.operation(4));
        System.out.println(factorialJava8.operation(4));
    }

    //interfejs funkcyjny, który pozwoli na obliczenie kwadratu i pierwiastka dowolnej liczby zmiennoprzecinkowej oraz silni liczby całkowitej:
    @FunctionalInterface
    interface MathOperation {
        double operation(Integer n);
    }
}
