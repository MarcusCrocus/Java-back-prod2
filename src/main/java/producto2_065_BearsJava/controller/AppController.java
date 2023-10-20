package producto2_065_BearsJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AppController {
    @GetMapping("/")
    public String ViewHomePage(){
        return "index.html";
    }
}
