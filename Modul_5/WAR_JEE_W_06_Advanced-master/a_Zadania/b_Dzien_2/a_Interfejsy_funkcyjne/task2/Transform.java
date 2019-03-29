package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task2;

@FunctionalInterface
public interface Transform<T, S> {

    T transform(S s);
}

