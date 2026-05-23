package com.maincraft.Task1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @PostMapping("/contact")
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ){
        System.out.println("User: " + name + " with mail: " + email + " has send: " + message);
        return "successfull";
    }
}
