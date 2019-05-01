package pl.marzenakaa.Article;

import org.hibernate.validator.constraints.NotBlank;
import pl.marzenakaa.Author.Author;
import pl.marzenakaa.Category.Category;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String title;

    @NotBlank
    private String content;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Category> categories;

    private boolean draft;

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

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public void addCategory(Category category){
        categories.add(category);
        category.getArticles().add(this);
    }

    public void removeCategory(Category category){
        categories.remove(category);
        category.getArticles().remove(this);
    }
}
