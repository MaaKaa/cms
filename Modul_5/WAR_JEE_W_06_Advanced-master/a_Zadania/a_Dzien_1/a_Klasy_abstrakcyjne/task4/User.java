package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task4;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.Group;

public class User {
    private String name;
    private String surname;
    private Group group;

    public User(){
    }

    public User(String name, String surname, Group group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                '}';
    }
}
