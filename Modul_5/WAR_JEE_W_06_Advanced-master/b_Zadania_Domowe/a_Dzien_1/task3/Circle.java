package b_Zadania_Domowe.a_Dzien_1.task3;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculateCircuit() {
        return 2 * Math.PI + r;
    }
}
