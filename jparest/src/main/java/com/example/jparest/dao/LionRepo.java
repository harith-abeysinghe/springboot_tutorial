package com.example.jparest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.jparest.model.Lion;

public interface LionRepo extends JpaRepository<Lion, Integer> {

    

}
