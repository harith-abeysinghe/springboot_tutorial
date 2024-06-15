package com.example.bootjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lion {
    @Id
    private int id;
    private String name;
    private String tech;
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

    @Override
    public String toString() {
        return "Lion [id=" + id + ", name=" + name + "]";
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

}
