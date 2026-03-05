package com.ecomerce.demo.repository;

import com.ecomerce.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepo extends JpaRepository<Product, UUID> {

    //JPQL Query (uses entity fields not table columns
    @Query("SELECT p FROM Product p WHERE p.name= :name")
    List<Product> findByName(@Param("name") String name);

    // Native SQL query (uses actual table + column names)
    @Query(value = "SELECT * FROM products WHERE category = :caategory", nativeQuery = true)
    List<Product> findByCategory(@Param("category") String category);
}
