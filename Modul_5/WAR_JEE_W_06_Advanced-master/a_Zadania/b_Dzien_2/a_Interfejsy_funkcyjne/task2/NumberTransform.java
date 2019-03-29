package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task2;

import a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task2.Transform;

public class NumberTransform implements Transform<Integer, Integer> {

    @Override
    public Integer transform(Integer s) {
        return s - 1;

    }
}
