package pl.marzenakaa.Category;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryDAO categoryDAO;

    @GetMapping("/all")
    public String showCategoriesList(Model model){
        List<Category> categories = categoryDAO.findAll();
        Hibernate.initialize(categories);
        model.addAttribute("categories", categories);
        return "categories-list";
    }

    @GetMapping("/add")
    public String showAddCategoryForm(Model model){
        model.addAttribute("category", new Category());
        return "add-category-form";
    }

    @PostMapping("/add")
    public String processAddCategoryForm(@ModelAttribute("category") @Valid Category category, BindingResult result){
        if (result.hasErrors()) {
            return "add-category-form";
        }
        categoryDAO.save(category);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String showEditCategoryForm(@PathVariable Long id, Model model) {
        Category category = categoryDAO.findById(id);
        model.addAttribute("category", category);
        return "add-category-form";
    }

    @PostMapping("/edit/{id}")
    public String processEditTweetForm(@ModelAttribute("category") @Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "add-category-form";
        }
        categoryDAO.edit(category);
        return "redirect:/categories/all";
    }

    @GetMapping("/delete/{id}")
    public String processDeleteCategory(@PathVariable Long id) {
        Category category = categoryDAO.findById(id);
        categoryDAO.remove(category);
        return "redirect:/categories/all";
    }
}
