package com.cwhcode.springbootex102;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("var1", "There is more to say than just hello!");
        model.addAttribute("var2", "Enjoy boot camp!");
        return "hometemplate";
    }

}
