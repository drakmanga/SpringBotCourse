package d.springbootframeworkcourse.FirstCourseSpring.controllers;



import d.springbootframeworkcourse.FirstCourseSpring.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model) {
        model.addAttribute("authors" , authorService.findAll());
        return "authors";
    }
}
