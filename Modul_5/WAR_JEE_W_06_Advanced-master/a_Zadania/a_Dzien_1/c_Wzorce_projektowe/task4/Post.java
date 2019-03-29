package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.task4;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject {
    private String content;
    private String title;

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    private List<Observer> observers;
    public Post() {
        observers = new ArrayList<Observer>(); }

    @Override
    public void attach(Observer observer) {

    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }
}
