package pl.marzenakaa;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import pl.marzenakaa.Article.Article;
import pl.marzenakaa.Article.ArticleDAO;
import pl.marzenakaa.Category.Category;
import pl.marzenakaa.Category.CategoryDAO;
import pl.marzenakaa.repository.ArticleRepository;
import pl.marzenakaa.repository.CategoryRepository;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
    private String showLatestArticles(Model model){
        List<Article> latestArticles = articleRepository.findLatestArticles();
        Hibernate.initialize(latestArticles);
        model.addAttribute("latestArticles", latestArticles);
        return "home";
    }

    @ModelAttribute("categories")
    public List<Category> showCategories(Model model){
        List<Category> categories = categoryRepository.findAll();
        Hibernate.initialize(categories);
        model.addAttribute("categories", categories);
        return categories;
    }

    @GetMapping("/categories/{id}")
    public String showArticlesByCategory(@PathVariable Long id, Model model){
        Category category = categoryRepository.findOne(id);
        List<Article> articlesByCategory = category.getArticles();
        Hibernate.initialize(articlesByCategory);
        model.addAttribute("articlesByCategory",articlesByCategory);
        return "category-articles";
    }

}
