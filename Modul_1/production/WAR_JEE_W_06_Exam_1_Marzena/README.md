<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">


# Podstawy programowania w Java - egzamin
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

#### Pamiętaj, że pull request musi być stworzony, aby wykładowca dostał Twoje odpowiedzi.

* podczas egzaminu **możesz** korzystać z notatek, kodu napisanego wcześniej, internetu i prezentacji,
* zabroniona jest jakakolwiek komunikacja z innymi kursantami oraz osobami na zewnątrz.
* czas na wykonanie zadań to **2** godziny.


##### Odpowiedzi na pytania programistyczne umieszczaj w przygotowanych do tego plikach

**Powodzenia!**

----------------------------------------------------------------------------------------

#### Zadanie 1. (2pkt)
W pliku `Main1.java` umieść metodę o sygnaturze `static int[] getDecreasingTab(int size)`.

1. Uzupełnij ciało metody tak by zwracała tablicę liczb.
2. Elementy w tablicy mają być ułożone od największego do najmniejszego. Zera nie umieszczamy w tablicy.
3. Różnica między wartościami kolejnych elementów ma wynosić 2.
4. Ilość elementów tablicy ma być równa parametrowi `size`.

Przykład dla size = 3
```
[6,4,2]
```
Przykład dla size = 4
```
[8,6,4,2]
```
Przykład dla size = 2
```
[4,2]
```

#### Zadanie 2. (2pkt)
W pliku `Main2.java` umieść metodę o sygnaturze `static String[] getStartWith(String str, char c)`.

1. Uzupełnij ciało metody tak by zwracała tablicę napisów powstałych z rozdzielenia napisu `str`,
 które zaczynają się od znaku `c`.
2. Znakiem podziału jest znak spacji.

Przykład zwracanej tablicy dla napisu **str**  = `jak nauczyć się programować w javie` oraz znaku **c** =  `j`:
```
[jak, javie]
```
#### Zadanie 3. (2pkt)
W pliku `Main3.java` umieść metodę o sygnaturze `static String getLongestWord()`.

1. Uzupełnij ciało metody tak by wczytywała z konsoli napisy do momentu wprowadzenia napisu `quit`.
2. Metoda ma zwracać napis zawierający największą ilość znaków, który został podany przez użytkownika.

#### Zadanie 4. (3pkt)

W pliku `Main4.java` umieść metodę o sygnaturze `static int[] rowSum(int[][] tab)`.

1. Uzupełnij ciało metody tak by zwracała jednowymiarową tablicę,
 której elementy będą równe sumie wszystkich elementów z wiersza tablicy wielowymiarowej.

Przykład dla tablicy `int tab[][]={{1,2,3},{4,5,6},{7,8,9}};`

```
[6, 15, 24]
```
#### Zadanie 5. (3pkt)
W pliku `Main5.java` umieść metodę o sygnaturze `static void findInFile(String fileName, String search)`.

1. Uzupełnij ciało metody tak by odczytała plik o zadanej nazwie `fileName`.
2. Następnie wyszuka w pliku wszystkich wystąpień napisu `search`.
3. W przypadku znalezienia wyszukiwanego zwrotu w lini pliku wyświetl jej numer w konsoli.

Przykład dla pliku o zawartości:

```
Pierwsza wersja Javy ukazała się w 1996 roku w wersji 1.0.
Został zaprojektowany i zaimplementowany pod przewodnictwem Jamesa .
Początkowo nazwany Oak – inspiracją był dąb który jego twórca widział z okna swojego biura.
Idea, która przyświecała autorom Javy, to „napisz raz, uruchamiaj gdziekolwiek”.
```
oraz wyszukiwanego zwrotu: `Javy`:

```
1
4
```

#### Zadanie 6. (4pkt)
W pliku `Main6.java` umieść metodę o sygnaturze `static int[][] countOccurrences(int[] tab)`.

1. Uzupełnij ciało metody tak by dla podanej w parametrze tablicy - `tab` zwróciła tablicę dwuwymiarową,
 gdzie pierwszy element będzie  liczbą występującą w tablicy `tab` a drugi ilością wystąpień tej liczby.

Przykład dla tablicy `int tab[]={1,2,2,1,3,2};`

```
[
[1, 2],
[2, 3],
[3, 1]
]
``` 
#### Zadanie 7. (4pkt)
 
W pliku `Main7.java` umieść metodę o sygnaturze `static boolean repeats(String line)`. 
1. Uzupełnij ciało metody tak by dla zadanego napisu - `line`
 metoda ma zwrócić `true` jeżeli w podanym napisie występuje dwa razy to samo słowo, `false` w przeciwnym wypadku.
2. Jako słowo traktujemy napisy oddzielone znakiem spacji. Pomijamy przypadek zawierania się jednego słowa w drugim. 
