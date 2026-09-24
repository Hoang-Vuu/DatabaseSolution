package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Links id field to id column in database
    private Integer id;

    @Column(name = "name") // Links name field to name column
    private String name;

    @Column(name = "description") // Links description field to description column
    private String description;

    @Column(name = "price") // Links price field to price column
    private Double price;

    @Column(name = "stock_quantity") // Links stockQuantity field to stock_quantity column
    private Integer stockQuantity;

    // Empty constructor as required by JPA
    public Product() {
    }

    // Constructor for easily creating new objects
    public Product(String name, String description,
                   Double price, Integer stockQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}