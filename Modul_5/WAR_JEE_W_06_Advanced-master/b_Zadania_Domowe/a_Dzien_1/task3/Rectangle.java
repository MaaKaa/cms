package b_Zadania_Domowe.a_Dzien_1.task3;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateCircuit() {
        return 2 * a * b;
    }
}
