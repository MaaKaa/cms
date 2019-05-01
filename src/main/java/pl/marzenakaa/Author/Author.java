package pl.marzenakaa.Author;

import org.hibernate.validator.constraints.NotBlank;
import pl.marzenakaa.Article.Article;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @OneToMany(mappedBy = "author", cascade = {CascadeType.ALL})
    private List<Article> articles;

    public Author() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public void addArticle(Article article){
        articles.add(article);
        article.setAuthor(this);
    }

    public void removeArticle(Article article){
        articles.remove(article);
        article.setAuthor(null);
    }
}
