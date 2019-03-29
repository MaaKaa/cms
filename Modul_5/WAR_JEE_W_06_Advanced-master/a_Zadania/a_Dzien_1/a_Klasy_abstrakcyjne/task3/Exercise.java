package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task3;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.Model;

public class Exercise implements Model {
    private Long id;
    private String title;
    private String description;

    public Exercise(String title, String description) {
        this(null, title, description);
    }

    public Exercise(Long id, String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public void setId(long id) {

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
