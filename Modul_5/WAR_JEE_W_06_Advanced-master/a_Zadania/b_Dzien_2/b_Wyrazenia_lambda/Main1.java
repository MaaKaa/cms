/*
1. Napisz program, który:
- pobierze od użytkownika n łańcuchów znaków
- umieści je w liście
- posortuje alfabetycznie
- wyświetli na ekranie.
Do sortowania kolekcji należy użyć wyrażenie lambda.
 */

package a_Zadania.b_Dzien_2.b_Wyrazenia_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main1 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj zadaną ilość łańcuchów znaków");
            String lineStr = scanner.nextLine();

            try {
                int line = Integer.parseInt(lineStr);
                List<String> list = new ArrayList<>();
                for (int i = 1; i <= line; i++) {
                    System.out.println("Podaj kolejny łańcuch znaków");
                    String text = scanner.nextLine();
                    list.add(text);
                }

                //when we are using a method reference – the target reference is placed before the delimiter :: and the name of the method is provided after it.
                list.sort(Comparator.comparing(String::toLowerCase));

                //sortowanie w druga strone. Od z do a
                list.sort(((o1, o2) -> o2.compareToIgnoreCase(o1)));

                for (String text : list) {
                    Consumer<String> consumer = System.out::println;
                    consumer.accept(text);
                }
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawna liczba ilości łańcuchów znaków");
            }
    }

}
