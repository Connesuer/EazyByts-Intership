package com.rentrover.RentRover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class RentCarController {
    @GetMapping("/rentcar")
    public String rentcar(){

        return "rentcar";

    }
}