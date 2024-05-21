package com.rentrover.RentRover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactUsController {
    
    @GetMapping("/contact")
    public String contactus() {
        return "contact";
    }
    

}
