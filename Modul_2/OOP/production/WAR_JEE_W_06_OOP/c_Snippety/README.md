<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">


# Programowanie obiektowe w Javie
> Kilka ważnych informacji


Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki:


#### Jak zdefiniować klasę?

```java
class Cat {
}
```

#### Jak utworzyć nowy obiekt klasy?

```java
Cat cat = new Cat();
```

#### Jak napisać konstruktor dla klasy?

```java
class Cat {
  
  public Cat() {
  //zawartość
  }
}  
```

#### Jak napisać konstruktor ustawiający atrybut dla klasy?

```java
class Cat {
    String name;
  
  public Cat(String catName){
    this.name = catName;
  }
}  
```


#### Jak zainicjalizować zmienną?

```java
class Cat {
  String name = "Mruczek";
  }
```

#### Jak zdefiniować publiczną metodę, która nie zwraca wartości?

```java
class Cat {
  
 public void hello(){
     //zawartość
  }
}
```

#### Jak zdefiniować publiczną metodę, która zwraca wartość typu String?

```java
class Cat {
   public String getName() {
    return this.name;
  }
}

```

#### Jak zdefiniować prywatną zmienną klasową?

```java
class Cat {
  
  private static int sum;
  
}
```

#### Jak zmodyfikować w konstruktorze zmienną klasową?

```java
class Cat {
  
  private static int sum;

  public Cat() {
    this.sum ++;
  }
}
```



#### Jak zapisać dziedziczenie?

```java
class Book{
}

class Ebook extends Book{
}
```


#### Jak wywołać konstruktor rodzica przy dziedziczeniu?

```java
class EBook extends Book{

  public Ebook() {
      super();
  }
}
```

#### Jak nadpisać metodę w klasie potomnej?

```java
class Book{
  public void printBook(){
   System.out.println("Drukowanie book ...");
  }
}

class Ebook extends Book{
   public void printBook() {
     System.out.println("Drukowanie ebook ...");
     super.printBook();  // wywoła metodę z klasy rodzica
   }
}
```

#### Jak zdefiniować i wywołać metodę klasową?

```java
class Book{
    static void hello(){
      
    }
}

Book.hello();
```
