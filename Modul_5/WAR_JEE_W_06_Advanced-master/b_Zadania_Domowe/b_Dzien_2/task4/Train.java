package b_Zadania_Domowe.b_Dzien_2.task4;


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

    @Override
    public String toString() {
        return "Train{" +
                "trackWidth=" + trackWidth +
                '}';
    }
}