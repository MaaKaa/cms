package b_Zadania_Domowe.b_Dzien_2.task4;

class Car extends Vehicle implements Inspectionable{

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

    @Override
    public void createInspection() {
        System.out.println("Model: " + this.getType() + "- sprawdzony.");
    }
}