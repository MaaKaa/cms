/*
1. Napisz program, który przy wykorzystaniu strumieni danych, dla podanej listy obiektów typu `String`:
- wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się na literę „a” lub „s”, posortowane alfabetycznie
- zwróci listę, która powstanie poprzez wybranie z listy unikalnych łańcuchów o długości równej 5
- utworzy obiekt typu `String`, zbudowany z posortowanych elementów listy ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami

 */

package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("arbuz");
        lista.add("samochód");
        lista.add("sarna");
        lista.add("sarna");
        lista.add("pociąg");
        lista.add("Coderslab");
        lista.add("automobil");

        lista.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s")) //filter() returns a stream consisting of the elements of this stream that match the given predicate (using Predicate interface).
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("---");

        List<String> list2 = lista.stream()
                .filter(s -> s.length() == 5)
                .distinct() //distinct() returns a stream consisting of the distinct elements
                .collect(Collectors.toList()); //collect() grupuje wszystkie elementy strumienia i zwraca w postaci zdefiniowanej przez dany Collector (zapisujemy w ten sposób wynik działania strumienia.
        System.out.println(list2);

        System.out.println("---");

        String text = lista.stream()
                .map(s -> s.substring(0, 3)) //zwraca przekształcony przy pomocy funkcji strumień, jako argument podajemy funkcję.
                .sorted(Comparator.comparing(String::toLowerCase))
                .collect(Collectors.joining(","));

        System.out.println(text);

    }
}
