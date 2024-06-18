package com.example.springdatarest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "lion")
public class Lion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lion_seq_generator")
    @SequenceGenerator(name = "lion_seq_generator", sequenceName = "LION_SEQ", allocationSize = 1)
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

    public String toString() {
        return "Lion [id=" + id + ", name=" + name + ", tech=" + tech + "]";
    }
}
