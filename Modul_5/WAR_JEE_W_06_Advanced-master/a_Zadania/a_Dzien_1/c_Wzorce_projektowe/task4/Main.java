package a_Zadania.a_Dzien_1.c_Wzorce_projektowe.task4;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setTitle("Some title");
        post.setContent("Some content");

        post.attach(new FacebookObserver());
        post.share();

    }
}
