package a_Zadania.b_Dzien_2.a_Interfejsy_funkcyjne.task1;

public class NumberFilter implements Filter<Integer> {

    public boolean check(Integer v) {

        return v < 20;

    }

}
