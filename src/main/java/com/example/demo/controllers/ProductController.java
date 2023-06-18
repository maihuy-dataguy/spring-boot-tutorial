package com.example.demo.controllers;


import com.example.demo.models.Product;
import com.example.demo.models.ResponseObject;
import com.example.demo.repositories.ProductRepository;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    ResponseEntity<ResponseObject> getProductById(@PathVariable Long id){
        Optional<Product> foundProduct  = repository.findById(id);

        return foundProduct.isPresent()?
                ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("ok","Query product successfully",foundProduct)
                ):
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                        new ResponseObject("failed","Cannot find product with id = " + id,"")
                );
//        return repository.findById(id).orElseThrow(
//                ()->new RuntimeException("Cannot find product with id = "+ id)
//        );
    }

    //insert new Product with Post method
    ResponseEntity<ResponseObject> insertProduct (@RequestBody Product newProduct){
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("ok","Insert product succesfully", repository.save(newProduct))
        );
    }

}
