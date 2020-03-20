package com.TechVF.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechVF.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
