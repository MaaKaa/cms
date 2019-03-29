package b_Zadania_Domowe.b_Dzien_2.task4;


class Main4 {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Train(120, "Model", 480);
        vehicles[1] = new Car(200, "Fiat", "SUV");

        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof Inspectionable){
                ((Inspectionable) vehicle).createInspection();
            }else{
                System.out.println(vehicle);
            }
        }
    }
}