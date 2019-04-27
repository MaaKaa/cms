package pl.marzenakaa;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.marzenakaa.Article.Article;
import pl.marzenakaa.Article.ArticleDAO;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private ArticleDAO articleDAO;

    @GetMapping("/")
    private String showLatestArticles(Model model){
        List<Article> latestArticles = articleDAO.findLatest(5);
        Hibernate.initialize(latestArticles);
        model.addAttribute("latestArticles", latestArticles);
        return "home";
    }

}
