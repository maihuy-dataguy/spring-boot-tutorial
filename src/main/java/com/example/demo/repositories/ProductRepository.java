package com.example.demo.repositories;

import com.example.demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Noi chua cac ham de lay data ve(data tu database(primary), file text, memory)
// JpaRepository<entity's type, primary key's type>
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductName(String productName);
}
