package a_Zadania.a_Dzien_1.b_Interfejsy.task3;

public class Main1 {
    public static void main(String[] args) {
        Moveable[] moveableTab = new Moveable[3];

        Person person = new Person();
        Cat cat = new Cat();
        Car car = new Car();

        moveableTab[0] = person;
        moveableTab[1] = cat;
        moveableTab[2] = car;

        for (int i=0; i<moveableTab.length; i++){
            moveableTab[i].start();
        }

        /*LUB:
        for(Moveable moveable : moveables){
            moveable.start();
        }
         */
    }
}
