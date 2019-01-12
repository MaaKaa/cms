<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# Programowanie obiektowe w Javie - praca domowa.

> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*][forking] repozytorium z zadaniami.
2. [*Sklonuj*][ref-clone] repozytorium na swój komputer.
3. Rozwiąż zadania i [*skomituj*][ref-commit] zmiany do swojego repozytorium.
4. [*Wypchnij*][ref-push] zmiany do swojego repozytorium na GitHubie.
5. Stwórz [*pull request*][pull-request] do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

#### Zadanie 1

**Praca domowa opiera się na modyfikacji zadań z dnia poprzedniego, poprzednie rozwiązania nie powinny być modyfikowane, zawartość klas możesz skopiować.**
 
 
Stwórz klasę `Person`, która ma spełniać następujące wymogi:
1. Mieć prywatne atrybuty:
 * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
 * `firstName` - atrybut określający imię autora,
 * `lastName` - atrybut określający nazwisko autora,

2. Zdefiniuj odpowiednie dziedziczenie między klasą `Author` a klasą `Person`.
3. Zdefiniuj odpowiednie dziedziczenie między klasą `User` a klasą `Person`.
4. Usuń nadmiarowe parametry oraz metody.


#### Zadanie 2

Stwórz klasę `SoundBook`, która ma spełniać następujące wymogi:
1. Mieć prywatne atrybuty:
 * `duration` - atrybut ten powinien przechowywać długość nagrań,
 * `numberOfCarriers` - atrybut określający liczbę nośników (płyt CD, kaset) które są zawarte w ramach jednej książki.

2. Zdefiniuj odpowiednie dziedziczenie między klasą `SoundBook` a klasą `Book`.

#### Zadanie 3

Zmodyfikuj klasę `Book`:

1. Dodaj prywatny atrybut `popularity` który będzie przechowywał ilość wypożyczeń, ilość ta powinna się zwiększać o 1 z każdym wypożyczeniem.
2. Zdefiniuj metodę `equals(Book book)`, która na podstawie atrybutu `id` zwróci informacje czy obiekty są równe.
3. Dodaj metodę `returnBook()` klasy `Book` - która dokona zwrotu książki - metoda nie przyjmuje parametru klasy `User`
 ponieważ posiada atrybut `currentUser`.


#### Zadanie 4

Zmodyfikuj klasę `User`:

1. Dodaj metodę `returnBook(Book book)` przyjmującą obiekt klasy `Book`, która oznaczy książką jako dostępną do wypożyczenia,
 przez zmianę atrybutu `available` na wartość `true`, usunie z tablicy `books` obiektu `User` obiekt `Book`.
2. Dodaj metodę `returnAllBooks()`, która dokona zwrotu wszystkich posiadanych książek.



<!-- Links -->
[forking]: https://guides.github.com/activities/forking/
[ref-clone]: http://gitref.org/creating/#clone
[ref-commit]: http://gitref.org/basic/#commit
[ref-push]: http://gitref.org/remotes/#push
[pull-request]: https://help.github.com/articles/creating-a-pull-request
[ref-multiple-forms]: http://stackoverflow.com/a/14071321
