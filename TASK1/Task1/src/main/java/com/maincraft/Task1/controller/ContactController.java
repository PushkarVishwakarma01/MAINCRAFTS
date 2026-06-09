package com.maincraft.Task1.controller;

import com.maincraft.Task1.model.Data;
import com.maincraft.Task1.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactRepository contactRepository;

    @PostMapping("/contact")
    public String contact(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message
    ){
        System.out.println("Name: " + " Email: " + " Message: " + message);
        contactRepository.save(new Data(name,email,message));
        return "Form submitted Successfully";
    }

    @GetMapping("/contacts")
    public List<Data> getData(){
        return contactRepository.findAll();
    }
}