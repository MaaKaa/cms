package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task3;

/*
Korzystając z utworzonych interfejsów utwórz klasę Main3 a w niej statyczną metodę o sygnaturze:
static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t)
Metoda ma zwracać elementy listy src, spełniające warunek określony w implementacji interfejsu Filter
i przekształcone przez metodę implementującą interfejs Transform.
 */

import a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1.Filter;
import a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task2.Transform;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings({"Duplicates"})
public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i <= 25; i++) {
            list.add(i);
        }

        List<Integer> result = create(list, i -> i < 20, i -> i - 1);
        System.out.println(result);
    }

    private static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        return src.stream()
                .filter(f::check)
                .map(t::transform)
                .collect(Collectors.toList());


//        List<T> result = new ArrayList<>();
//        for (S s : src) {
//            if (f.check(s)) {
//                result.add(t.transform(s));
//            }
//        }
//        return result;
    }
}