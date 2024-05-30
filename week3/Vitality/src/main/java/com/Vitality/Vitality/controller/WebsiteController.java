package com.Vitality.Vitality.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class WebsiteController {
    
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/plans")
    public String plans() {
        return "plans";
    }

    @GetMapping("/reviews")
    public String reviews() {
        return "reviews";
    }
    
    @GetMapping("/contactus")
    public String contactus() {
        return "contactus";
    }
    
    
}
