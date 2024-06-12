package com.example.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(value = "prototype")  - removes singleton pattern
public class Lion {
    private int id;
    private String name;
    private String tech;
    //private Laptop laptop = new Laptop();
    
    //Laptop is still a private variable
    @Autowired //searches for the object of Laptop class in the container and assigns it to laptop, searches by class name
    @Qualifier("lap1") //searches by name
    private Laptop laptop; //adding @Component to Laptop class removes the need to instantiale it here



    public Lion() {
        super();
        System.out.println("In Lion Constructor");
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
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    
    /*
    public void compile() {
        System.out.println("Compiling");
    }
    */

}
