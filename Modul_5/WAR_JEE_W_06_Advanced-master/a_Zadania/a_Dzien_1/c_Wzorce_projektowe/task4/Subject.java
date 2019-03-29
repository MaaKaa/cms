package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.task4;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}