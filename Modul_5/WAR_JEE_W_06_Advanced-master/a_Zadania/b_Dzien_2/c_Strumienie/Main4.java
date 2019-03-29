/*
Stwórz listę elementów typu `String`, następnie utwórz strumień, który:
- wypisze na konsoli długości elementów listy
- zwróci listę posortowaną alfabetycznie
- wypisze na konsoli elementy, które zawierają literę „c”
- zwróci sumę długości wszystkich elementów
- zwróci 3 pierwsze elementy posortowane alfabetycznie

 */

package a_Zadania.b_Dzien_2.c_Strumienie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banan");
        list.add("arbuz");
        list.add("cytryna");
        list.add("dynia");

        list.stream()
                .forEach(s -> System.out.println(s.length()));

        List<String> sortedCollection = list.stream()
                .sorted(String::compareToIgnoreCase) //Returns a stream consisting of the elements of this stream, sorted according to the provided Comparator.
                .collect(Collectors.toList());

        System.out.println("sortedCollection" + sortedCollection);

        list.stream()
                .filter(s -> s.contains("c"))
                .forEach(System.out::println);

        int collectorSolution = list.stream()
                .collect(Collectors.joining()) //joining() method of Collectors Class is used to join various elements of a character or string array into a single string object.
                .length();

        System.out.println("collectorSolution: " + collectorSolution);

        int result = list.stream()
                .mapToInt(String::length) //returns an IntStream consisting of the results of applying the given function to the elements of this stream.
                .sum();

        System.out.println("Result: " + result);

        List<String> limitResult = list.stream()
                .limit(3)
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println("limitResult: " + limitResult);
    }
}
