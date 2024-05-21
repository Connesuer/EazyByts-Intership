package com.rentrover.RentRover.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;






@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return  "index";
    }
    
    
    public String rencar(){
        return "rentcar";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    

}
