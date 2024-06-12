package com.example.tutorial;

import org.springframework.stereotype.Component;

//@Component //removes the need to instntiate the object in Lion class @AutoWired
@Component("lap1") //assigns a name to the object @Qualifier

public class Laptop {
    private int id;
    private String brand;


    

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
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", id=" + id + "]";
    }

    public void compile() {
        System.out.println("Compiling");
    }
}
