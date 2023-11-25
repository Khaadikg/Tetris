package controller;

import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    public String mainPage() {
        return "index";
    }


}
