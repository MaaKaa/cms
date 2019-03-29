package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task1;

class Car extends Vehicle {

    private String type;

    Car(Integer maxSpeed, String model, String type) {
        super(maxSpeed, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

}