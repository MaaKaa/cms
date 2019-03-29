package b_Zadania_Domowe.a_Dzien_1.task2;

import b_Zadania_Domowe.a_Dzien_1.task1.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Jan", "Nowak");
        Person person2 = new Person("Anna", "Kowalska");
        Person person3 = new Person("Janina", "Zygmunt");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Collections.sort(people);

        System.out.println(people);
    }

}
