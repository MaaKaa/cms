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

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleDAO articleDAO;

    @Autowired
    AuthorDAO authorDAO;

    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping("/all")
    public String showArticlesList(Model model){
        List<Article> articles = articleDAO.findAll();
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
        articleDAO.save(article);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String showEditArticleForm(@PathVariable Long id, Model model) {
        Article article = articleDAO.findById(id);
        model.addAttribute("article", article);
        return "add-article-form";
    }

    @PostMapping("/edit/{id}")
    public String processEditArticleForm(@ModelAttribute("article") @Valid Article article, BindingResult result) {
        if (result.hasErrors()) {
            return "add-article-form";
        }
        articleDAO.edit(article);
        return "redirect:/articles/all";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteArticle(@PathVariable Long id) {
        articleDAO.remove(id);
        return "redirect:/articles/all";
    }

    @ModelAttribute("authors")
    public List<Author> showAuthors(){
        List<Author> authors = authorDAO.findAll();
        return authors;
    }

    @ModelAttribute("categories")
    public List<Category> showCategories(){
        List<Category> categories = categoryDAO.findAll();
        return categories;
    }

    @ModelAttribute("drafts")
    public List<Article> showDrafts(){
        List<Article> drafts = articleDAO.findDrafts();
        return drafts;
    }

}
