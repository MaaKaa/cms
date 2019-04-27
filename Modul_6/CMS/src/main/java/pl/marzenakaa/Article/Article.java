package pl.marzenakaa.Article;

import pl.marzenakaa.Author.Author;
import pl.marzenakaa.Category.Category;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 200)
    private String title;

    @OneToOne
    private Author author;

    @OneToMany
    private List<Category> categories = new ArrayList<>();

    private String content;

    private LocalDateTime created;

    private LocalDateTime updated;

    @PrePersist
    public void prePersist(){
        created = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate(){
        updated = LocalDateTime.now();
    }
}
