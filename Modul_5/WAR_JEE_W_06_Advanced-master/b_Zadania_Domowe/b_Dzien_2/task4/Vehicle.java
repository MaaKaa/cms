package b_Zadania_Domowe.b_Dzien_2.task4;



abstract class Vehicle {

    private Integer maxSpeed;
    private String model;

    Vehicle(Integer maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("Class : %s, model: %s, speed: %d", this.getClass().getName(), model, maxSpeed);
    }
}