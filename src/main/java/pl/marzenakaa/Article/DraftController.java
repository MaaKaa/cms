package pl.marzenakaa.Article;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.marzenakaa.repository.ArticleRepository;

import java.util.List;

@Controller
@RequestMapping("drafts")
public class DraftController {

    @Autowired
    ArticleDAO articleDAO;

    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/all")
    public String showDraftsList(Model model){
        List<Article> drafts = articleRepository.findDrafts();
        Hibernate.initialize(drafts);
        model.addAttribute("drafts", drafts);
        return "drafts-list";
    }

    @GetMapping("/add")
    public String showAddDraftForm(@RequestParam boolean draft, Model model){
        Article newDraft = new Article();
        newDraft.setDraft(draft);
        model.addAttribute("draft", newDraft);
        return "add-article-form";
    }

}
