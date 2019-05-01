package pl.marzenakaa;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
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

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private ArticleDAO articleDAO;

    @Autowired
    private CategoryDAO categoryDAO;

    @GetMapping("/")
    private String showLatestArticles(Model model){
        List<Article> latestArticles = articleDAO.findLatest(5);
        Hibernate.initialize(latestArticles);
        model.addAttribute("latestArticles", latestArticles);
        return "home";
    }

    @ModelAttribute("categories")
    public List<Category> showCategories(Model model){
        List<Category> categories = categoryDAO.findAll();
        Hibernate.initialize(categories);
        model.addAttribute("categories", categories);
        return categories;
    }

    @GetMapping("/categories/{id}")
    public String showArticlesByCategory(@PathVariable Long id, Model model){
        Category category = categoryDAO.findById(id);
        List<Article> articlesByCategory = category.getArticles();
        Hibernate.initialize(articlesByCategory);
        model.addAttribute("articlesByCategory",articlesByCategory);
        return "category-articles";
    }

}
