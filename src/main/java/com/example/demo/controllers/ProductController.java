package com.example.demo.controllers;


import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI : Dependency injection
    //Tu dong tao doi tuong repository ngay khi app dc start
    @Autowired
    private ProductRepository repository;

    //Get all product
    @GetMapping("")
//    this request is :http://localhost:8080/api/v1/Products
    List<Product> getAllProducts(){
        return repository.findAll();//tra lai tat ca data
    }

    //Get specific product
    @GetMapping("/{id}")
    //Let 's return an object with :data, message, status
    Product getProductById(@PathVariable Long id){
        return repository.findById(id).orElseThrow(
                ()->new RuntimeException("Cannot find product with id = "+ id)
        );
    }
}
