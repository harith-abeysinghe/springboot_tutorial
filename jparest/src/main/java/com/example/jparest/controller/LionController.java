package com.example.jparest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.jparest.dao.LionRepo;
import com.example.jparest.model.Lion;




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

    @RequestMapping("/lions")
    @ResponseBody
    public List<Lion> getLion() {
        return repo.findAll();
    }

    @RequestMapping("/lions/{id}")
    @ResponseBody
    public Optional<Lion> getLionbyId(@PathVariable("id") int id) {
        return repo.findById(id);
    }
    
}
