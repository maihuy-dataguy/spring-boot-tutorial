package com.example.demo.database;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Goi khi chay ung dung, khoi tao database, khoi tao bien moi truong
@Configuration
public class Database {
    //Logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    //Khoi tao ngay khi app chay
    //Insert du lieu vao bang, neu chua co table se tao table
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                Product productA = new Product("Macbook Pro 15",2020,2200.0,"");
                Product productB = new Product("Ipad Air Green   ",2021,599.0,"");
                logger.info("insert data: "+ productRepository.save(productA));
                logger.info(    "insert data: "+ productRepository.save(productB));
            }
        };
    }

}
