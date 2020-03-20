package com.TechVF.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechVF.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
