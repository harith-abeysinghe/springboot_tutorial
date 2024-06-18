package com.example.springdatarest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.springdatarest.model.Lion;

@RepositoryRestResource(collectionResourceRel = "lions", path = "lions")
public interface LionRepo extends JpaRepository<Lion, Integer>{

}
