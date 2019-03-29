package a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.task3;

import a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.dao.Model;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // create exercise
        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise e = new Exercise("sample title", "sample description");
        //save exercise to database
        exerciseDao.save(e);

        //get all exercise
        List<Model> exercises = exerciseDao.loadAll();
        for (Model model : exercises) {
            Exercise exercise = (Exercise) model;
            System.out.println(exercise.getTitle());
            System.out.println(exercise.getDescription());
        }
        //update exercise
        e.setTitle("other title");
        e.setDescription("other description");
        exerciseDao.save(e);

        //remove exercise
        Exercise firstElement = (Exercise) exerciseDao.loadById(1);
        if (firstElement != null) {
            exerciseDao.delete(firstElement);
        }
    }

}
