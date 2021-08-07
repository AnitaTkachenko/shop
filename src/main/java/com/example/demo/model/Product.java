package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private int price;
    private String description;
    private String manufacturer;
    private String category;
    private int quantity;


    public Product(String name,int price, String description, String manufacturer, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.manufacturer = manufacturer;
        this.category = category;
        this.quantity = 1;
    }
}
