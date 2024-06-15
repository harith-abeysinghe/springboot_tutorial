package com.example.bootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bootjpa.dao.LionRepo;
import com.example.bootjpa.model.Lion;




@Controller
public class LionController {

    @Autowired
    LionRepo repo;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    
    @RequestMapping("/addLion")
    public String addLion(Lion lion) {
        repo.save(lion);
        return "home";
    }
    
}
