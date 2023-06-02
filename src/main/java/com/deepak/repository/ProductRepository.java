package com.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}