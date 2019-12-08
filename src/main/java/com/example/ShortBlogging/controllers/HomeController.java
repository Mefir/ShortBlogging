package com.example.ShortBlogging.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getWelcome() {
        return "index";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index";
    }

    @GetMapping("/about")
    public String getabout() {
        return "about";
    }

    @GetMapping("/contact")
    public String getcontact() {
        return "contact";
    }

    @GetMapping("/post")
    public String getpost() {
        return "post";
    }

}
