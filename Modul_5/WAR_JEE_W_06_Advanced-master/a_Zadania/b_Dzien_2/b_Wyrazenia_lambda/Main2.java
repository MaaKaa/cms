/*
Korzystając z interfejsu funkcyjnego Predicate napisz wyrażenie lambda, które będzie sprawdzało czy podany parametr jest typu znakowego (String)
i jeśli tak, to wypisze go na ekranie

 */

package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

        Predicate<Object> stringChecker = o -> o instanceof String;

        System.out.println(stringChecker.test("ALA"));

        System.out.println(stringChecker.test(34));
    }

}
