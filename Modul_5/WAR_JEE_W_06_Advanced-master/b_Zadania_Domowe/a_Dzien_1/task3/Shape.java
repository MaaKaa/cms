package b_Zadania_Domowe.a_Dzien_1.task3;

public abstract class Shape {

    public double area;
    public double circuit;
    public String color;

    public Shape(){}

    public Shape(double area, double circuit, String color) {
        this.area = area;
        this.circuit = circuit;
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculateCircuit();

}
