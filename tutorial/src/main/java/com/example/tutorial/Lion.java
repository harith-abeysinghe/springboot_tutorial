package com.example.tutorial;

import org.springframework.stereotype.Component;

@Component
public class Lion {
    private int id;
    private String name;
    private String tech;

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the tech
     */
    public String getTech() {
        return tech;
    }

    /**
     * @param tech the tech to set
     */
    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show() {
        System.out.println("In show");
    }

}
