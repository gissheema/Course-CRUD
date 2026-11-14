package com.example.coursedemo.repository;

import com.example.coursedemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Standard CRUD methods (save, findById, findAll, deleteById) are inherited
}