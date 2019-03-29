package b_Zadania_Domowe.b_Dzien_2.task5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {

    }

    //metoda ma zwrócić listę elementów spełniających warunek
    public static <T> List<T> search(Collection<T> collection, Predicate<T> predicate){
        List<T> filteredList = (List<T>) collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        return filteredList;
    }

    //metoda ma przekształcić elementy za pomocą function i dodać do nowej zwracanej kolekcji
    public static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function){
        List<S> newList = new ArrayList<>();
        for (Object element : collection){
            function.apply((T) element);
            newList.add((S) element);
        }
        return newList;
    }

    //metoda ma przekształcić elementy za pomocą consumer
    public static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer){
        for (Object element : collection){
            consumer.accept((T) element);
        }
    }

}
