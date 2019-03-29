/*
Napisz program, który będzie posiadał klasę reprezentującą pracownika `Employee`, zawierającą atrybuty takie jak `imię`, `nazwisko`, `płeć`, `data urodzenia`, `wysokość wynagrodzenia`.
 Utwórz kilka obiektów klasy `Employee`, a następnie:
- wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”
- wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
- daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł.
 */

package a_Zadania.b_Dzien_2.c_Strumienie;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static a_Zadania.b_Dzien_2.c_Strumienie.Gender.FEMALE;
import static a_Zadania.b_Dzien_2.c_Strumienie.Gender.MALE;

public class Main2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Jan", "Kowalski", MALE,
                LocalDate.of(1990, 01, 01), BigDecimal.valueOf(1800.00)));
        list.add(new Employee("Karol", "Nowicki", MALE,
                LocalDate.of(1993, 01, 01), BigDecimal.valueOf(2300.00)));
        list.add(new Employee("Anna", "Nowak", FEMALE,
                LocalDate.of(1997, 01, 01), BigDecimal.valueOf(3000.0)));

        list.stream()
                .filter(e -> e.getLastName().startsWith("N"))
                .forEach(System.out::println);

        System.out.println("---");

        list.stream()
                .filter(e -> e.getBirthday().isAfter(LocalDate.now().minusYears(45))
                        && e.getBirthday().isBefore(LocalDate.now().minusYears(30)))
                .forEach(System.out::println);

        System.out.println("---");

        list.stream()
                .filter(e -> FEMALE == e.getGender())
                .filter(e -> isAgeValid(e.getBirthday()))
                .filter(e -> isSalaryValid(e.getSalary()))
                .forEach(e -> e.setSalary(calculateNewSalary(e.getSalary())));

        for (Employee employee : list) {
            System.out.println(employee.getSalary());
        }
    }


    private static boolean isAgeValid(LocalDate birthday) {
        return birthday.isAfter(LocalDate.now().minusYears(30))
                && birthday.isBefore(LocalDate.now().minusYears(20));
    }

    private static boolean isSalaryValid(BigDecimal salary) {
        return salary.compareTo(BigDecimal.valueOf(3500.00)) < 0;
    }

    private static BigDecimal calculateNewSalary(BigDecimal currentSalary) {
        return currentSalary.multiply(BigDecimal.valueOf(1.05));
    }
}
