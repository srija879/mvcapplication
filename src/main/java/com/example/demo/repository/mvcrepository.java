package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.mvc;

@Repository
public interface mvcrepository extends CrudRepository<mvc, Integer>{

}