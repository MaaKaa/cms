/*
Korzystając z interfejsu funkcyjnego Predicate napisz wyrażenie lambda, które będzie sprawdzało czy podany parametr jest typu liczbowego (Number)
i jeśli tak, to wypisze go na ekranie.
 */

package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main3 {

    public static void main(String[] args) {

        Predicate<Object> predicate = o -> o instanceof Number;

        List<Object> list = new ArrayList<>();

        list.add("Ala");
        list.add(0);
        list.add(true);
        list.add(10f);
        list.add(new Book());
        list.add(new StrangeObject());

        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static class StrangeObject extends Number {

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }

        @Override
        public String toString() {
            return "Tez jestem Numberem :)";
        }

    }

}
