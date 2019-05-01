package pl.marzenakaa.Author;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    AuthorDAO authorDAO;

    @GetMapping("/all")
    public String showAuthorsList(Model model){
        List<Author> authors = authorDAO.findAll();
        Hibernate.initialize(authors);
        model.addAttribute("authors", authors);
        return "authors-list";
    }

    @GetMapping("/add")
    public String showAddAuthorForm(Model model){
        model.addAttribute("author", new Author());
        return "add-author-form";
    }

    @PostMapping("/add")
    public String processAddAuthorForm(@ModelAttribute("author") @Valid Author author, BindingResult result){
        if (result.hasErrors()) {
            return "add-author-form";
        }
        authorDAO.save(author);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String showEditAuthorForm(@PathVariable Long id, Model model) {
        Author author = authorDAO.findById(id);
        model.addAttribute("author", author);
        return "add-author-form";
    }

    @PostMapping("/edit/{id}")
    public String processEditAuthorForm(@ModelAttribute("author") @Valid Author author, BindingResult result) {
        if (result.hasErrors()) {
            return "add-author-form";
        }
        authorDAO.edit(author);
        return "redirect:/authors/all";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteAuthor(@PathVariable Long id) {
        Author author = authorDAO.findById(id);
        authorDAO.remove(author);
        return "redirect:/authors/all";
    }

}
