package example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;

@Controller
public class MainController {


    @GetMapping("/task1")
    public String task1(@RequestParam(name = "word") String word, Model model) throws SQLException {
        model.addAttribute("wordSign", word);
        DataAccess data = new DataAccess();
        data.LoadList();
        return "task1template";

    }

    @GetMapping("/index")
    public String index() throws SQLException {
        return "index";
    }
    @GetMapping("/code.js")
    public String codejs() throws SQLException {
        return "code.js";
    }

    @GetMapping("/jquery-3.3.1.js")
    public String jquery() throws SQLException {
        return "jquery-3.3.1.js";
    }

    @PostMapping("/join")

    public String join(@RequestParam(name = "user") String user, @RequestParam(name = "pass") String pass) throws SQLException {
        return "";
        if (name!=DataAccess.LoadList) {
            DataAccess.createUser = name;
        }
        else ()
    }

    @GetMapping("/get_msg")

    public String get_msg() throws SQLException {
        return "";
    }

    @GetMapping("/list_users")

    public String list_users() throws SQLException {
        return "";
    }

    @GetMapping("/post_msg")

    public String post_msg(@RequestParam(name = "msg") String msg) throws SQLException {
        return "";
    }
}