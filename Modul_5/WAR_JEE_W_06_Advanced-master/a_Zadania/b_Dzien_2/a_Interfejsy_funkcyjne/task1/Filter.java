package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1;

@FunctionalInterface
public interface Filter<V> {

    boolean check(V v);
}