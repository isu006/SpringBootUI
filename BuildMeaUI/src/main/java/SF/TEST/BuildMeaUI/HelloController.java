package SF.TEST.BuildMeaUI;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=true, defaultValue="World") String name, Model model) {
      String FullName = name + " Kammmeyer";
      model.addAttribute("name", FullName);
        return "greeting";
    }
}