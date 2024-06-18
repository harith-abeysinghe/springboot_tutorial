package com.example.jparest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.jparest.model.Lion;

public interface LionRepo extends CrudRepository<Lion, Integer> {

    // no implementation needed, Spring Data JPA will provide the implementation
    //method should start with findBy followed by the property name
    //anything else will fail
    List<Lion> findByTech(String string);

    //method should start with findBy followed by the property name and then the condition
    //these conditions are predefined by Spring Data JPA
    List<Lion> findByIdGreaterThan(int i);

    //Writing custom queries
    @Query("from Lion where tech=?1 order by name")
    List<Lion> findByTechSorted(String tech);

}
