package com.example.demo.controllers;


import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.peer.ListPeer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    @GetMapping("")
//    this request is :http://localhost:8080/api/v1/Products
    List<Product> getAllProducts(){
        return Arrays.asList(
                new Product(1L,"Macbook pro 16 inch", 2020, 2400.0, ""),
                new Product(2L,"ipad air green ", 2020, 2400.0, "")
        );
    }


}
