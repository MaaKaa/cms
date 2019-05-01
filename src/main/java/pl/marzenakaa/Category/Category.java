package pl.marzenakaa.Category;

import pl.marzenakaa.Article.Article;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    private String name;

    private String description;

    @ManyToMany(mappedBy = "categories", fetch=FetchType.EAGER)
    private List<Article> articles = new ArrayList<>();

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return name;
    }
}
