package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task2;

import a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1.Filter;
import a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1.NumberFilter;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"Duplicates"})

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 25; i++) {
            list.add(i);

        }

        //Wywołanie metody z użyciem obiektu klasy Number Filter
        printList(list, new NumberFilter(), new NumberTransform());

        System.out.println("---");

        //Wywołanie metody z użyciem wyrażenia lambda
        printList(list, v -> v < 20, integer -> integer - 1);

        System.out.println("---");

        printList(list, i -> i < 20, i -> i - 1);

    }

    private static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
