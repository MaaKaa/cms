package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task1;



class Train extends Vehicle {

    private int trackWidth;

    public Train(Integer maxSpeed, String model, int trackWidth) {
        super(maxSpeed, model);
        this.trackWidth = trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }





}