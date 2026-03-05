package com.ecomerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name= "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @UuidGenerator
//    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String description;
    private int price;
    private boolean isAvailable;
}
