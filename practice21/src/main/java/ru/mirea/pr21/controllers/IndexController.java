package ru.mirea.pr21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping
    public String index() {
        return "redirect:/home";
    }
}
