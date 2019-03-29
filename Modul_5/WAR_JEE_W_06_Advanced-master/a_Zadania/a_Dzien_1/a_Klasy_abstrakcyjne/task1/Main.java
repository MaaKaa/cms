package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task1;



class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Train(120, "Model", 480);
        vehicles[1] = new Car(200, "Fiat", "SUV");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}