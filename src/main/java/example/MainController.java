package example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class MainController {
    @GetMapping()
    public String greeting() {
        return "greeting";
    }
    @GetMapping("/task1")
    public String task1 (@RequestParam(name="word") String word, Model model) throws SQLException{
        model.addAttribute("wordSign", word);
        DataAccess data = new DataAccess();
        data.LoadList();
        return "task1template";

    }
}
