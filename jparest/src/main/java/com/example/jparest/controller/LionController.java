package com.example.jparest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jparest.dao.LionRepo;
import com.example.jparest.model.Lion;

@RestController
public class LionController {

    @Autowired
    LionRepo repo;

    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    
    @PostMapping("/lions")
    public Lion addLion(@RequestBody Lion lion) {
        repo.save(lion);
        return lion;
    }

    @GetMapping("/lions")
    public List<Lion> getLion() {
        return repo.findAll();
    }

    @DeleteMapping("/lions/{id}")
    public Lion deleteLion(@PathVariable("id") int id) {
        Lion lion = repo.findById(id).get();
        repo.delete(lion);
        return lion;
    }

    @PutMapping("/lions/{id}")
    public Lion updateLion(@RequestBody Lion lion) {
        repo.save(lion);
        return lion;
    }
    
    @RequestMapping("/lions/{id}")
    @ResponseBody
    public Optional<Lion> getLionbyId(@PathVariable("id") int id) {
        return repo.findById(id);
    }
    
}
