package com.zaleskjn.myfirst.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutController {

    @RequestMapping("/")
    public String home() {
        return "index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "about.html";
    }
}
