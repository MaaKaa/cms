package pl.marzenakaa.Article;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.marzenakaa.Author.Author;
import pl.marzenakaa.Author.AuthorDAO;
import pl.marzenakaa.Category.Category;
import pl.marzenakaa.Category.CategoryDAO;
import pl.marzenakaa.repository.ArticleRepository;
import pl.marzenakaa.repository.AuthorRepository;
import pl.marzenakaa.repository.CategoryRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/all")
    public String showArticlesList(Model model){
        List<Article> articles = articleRepository.findAll();
        Hibernate.initialize(articles);
        model.addAttribute("articles", articles);
        return "articles-list";
    }

    @GetMapping("/add")
    public String showAddArticleForm(Model model){
        model.addAttribute("article", new Article());
        return "add-article-form";
    }

    @PostMapping("/add")
    public String processAddArticleForm(@ModelAttribute("article") @Valid Article article, BindingResult result){
        if (result.hasErrors()) {
            return "add-article-form";
        }
        articleRepository.save(article);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String showEditArticleForm(@PathVariable Long id, Model model) {
        Article article = articleRepository.findOne(id);
        model.addAttribute("article", article);
        return "add-article-form";
    }

    @PostMapping("/edit/{id}")
    public String processEditArticleForm(@ModelAttribute("article") @Valid Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "add-article-form";
        }
        articleRepository.save(article);
        return "redirect:/articles/all";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteArticle(@PathVariable Long id) {
        articleRepository.delete(id);
        return "redirect:/articles/all";
    }

    @ModelAttribute("authors")
    public List<Author> showAuthors(){
        List<Author> authors = authorRepository.findAll();
        return authors;
    }

    @ModelAttribute("categories")
    public List<Category> showCategories(){
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }

    @ModelAttribute("drafts")
    public List<Article> showDrafts(){
        List<Article> drafts = articleRepository.findDrafts();
        return drafts;
    }

}
