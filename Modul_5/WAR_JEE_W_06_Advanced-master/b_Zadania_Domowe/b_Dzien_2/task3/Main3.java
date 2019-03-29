package b_Zadania_Domowe.b_Dzien_2.task3;

import java.util.function.Function;

public class Main3 {
    public static void main(String[] args) {
        String sample = "CODERSLAB";

        Function<String, String> sampleText = s -> s.substring(2,s.length()-2).toLowerCase();

        cutText(sampleText, sample);
    }

    public static void cutText(Function<String, String> sampleText, String sample){
        String result = sampleText.apply(sample);
        System.out.println("Cut text: " + result);
    }
}
