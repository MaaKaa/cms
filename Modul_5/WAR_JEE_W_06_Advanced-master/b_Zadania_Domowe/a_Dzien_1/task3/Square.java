package b_Zadania_Domowe.a_Dzien_1.task3;

public class Square extends Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateCircuit() {
        return 4 * a;
    }
}
