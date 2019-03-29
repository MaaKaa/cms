package b_Zadania_Domowe.a_Dzien_1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();

        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(2);
        Circle circle = new Circle(2);

        System.out.println("Prostokąt o bokach: " + rectangle.getA() + " i " + rectangle.getB() + " - pole: " + rectangle.calculateArea() + ", obwód: " + rectangle.calculateCircuit());
        System.out.println("Kwadrat o boku: " + square.getA() + " - pole: " + square.calculateArea() + ", obwód: " + square.calculateCircuit());
        System.out.println("Koło o promieniu: " + circle.getR() + "- pole: " + circle.calculateArea() + ", obwód: " + circle.calculateCircuit());

    }
}
