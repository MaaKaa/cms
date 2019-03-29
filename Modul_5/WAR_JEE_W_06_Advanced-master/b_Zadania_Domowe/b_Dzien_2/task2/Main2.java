/*
1. Napisz program, który będzie zawierał metodę filterList pozwalającą na filtrowanie zawartości listy obiektów typu String.
 Metoda filterList ma przyjmować dwa argumenty – listę obiektów String, oraz referencję obiektu `Predicate`
  określający warunek filtrowania. Metoda ma zwracać listę przefiltrowanych obiektów.
Korzystając z metody filterList przefiltruj listę wybierając z niej:
- obiekty których długość jest większa niż 4
- obiekty zawierające literę „b”
- obiekty które kończą się na literę „a”
 List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");
 */

package b_Zadania_Domowe.b_Dzien_2.task2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "truskawka");

        Predicate<String> longerThanFour = s -> s.length() > 4;
        Predicate<String> containsB = s -> s.contains("b");
        Predicate<String> endsWithA = s -> s.endsWith("e");

        System.out.println("Longer than four: " + filterList(list, longerThanFour));
        System.out.println("Contain 'b': " + filterList(list, containsB));
        System.out.println("End with 'a': " + filterList(list, endsWithA));
    }



    public static List<String> filterList(List<String> list, Predicate predicate){

        List<String> filteredList = (List<String>) list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return filteredList;
    }

}
