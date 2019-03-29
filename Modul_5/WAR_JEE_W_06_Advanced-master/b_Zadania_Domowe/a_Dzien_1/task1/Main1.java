/*
1. W pliku `Main1` umieszczony został kod, który umieszcza w tablicy obiekty. Następnie wykonuje sortowanie tablicy.
2. Po uruchomieniu programu zauważysz że zwracany jest wyjątek, popraw kod dodając instrukcję `implements`
w następujący sposób:     public class Person implements Comparable<Person>
3. Dodaj implementację wymaganej metody, ma ona porównywać osoby względem pierwszej litery nazwiska.
4. Możesz w tym celu wykorzystać metodę klasy `String` - `compareTo`;
5. Po wprowadzeniu zmian uruchom ponownie program i zweryfikuj czy działa poprawnie.

Zapoznaj się z interfejsem -  [*Comparable*][comparable]

Pamiętaj że jeżeli operujesz na danych pobieranych z bazy danych możesz je odpowiednio sortować przy pomocy zapytania SQL.

Takiej możliwości może nie być w przypadku korzystania z API od zewnętrznego dostawcy.

 */

package b_Zadania_Domowe.a_Dzien_1.task1;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		Person[] people = new Person[5];
		people[0] = new Person("z", "z");
		people[1] = new Person("b", "b");
		people[2] = new Person("f", "f");
		people[3] = new Person("x", "x");
		people[4] = new Person("y", "y");

		Arrays.sort(people);

		for (Person person : people) {
			System.out.println(person);
		}

	}

}
