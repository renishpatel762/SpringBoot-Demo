package com.ecomerce.demo.service;

import com.ecomerce.demo.model.Product;
import com.ecomerce.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts(){
        // sort
        // pagination
        // only specific fields
        return repo.findAll();
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product getById(UUID id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
