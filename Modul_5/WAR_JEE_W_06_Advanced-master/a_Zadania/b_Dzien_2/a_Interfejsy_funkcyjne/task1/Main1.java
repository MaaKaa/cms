package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        //tworzymy listę i wypełniamy ją liczbami
        List<Integer> list = new ArrayList<>();
        for (int i = 15; i <= 25; i++) {
            list.add(i);
        }

        //Wywołanie metody z wykorzystaniem obiektu klasy NumberFilter
        printList(list, new NumberFilter());

        System.out.println("---");

        //Wywołanie metody z wykorzystaniem klasy anonimowej
        printList(list, new Filter<Integer>() {
            @Override
            public boolean check(Integer v) {
                return v < 20;
            }
        });

        System.out.println("---");

        //Wywołanie metody z wykorzystaniem wyrażenia lambda
        printList(list, v -> { int i = 0; return v < 20;});

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

}
