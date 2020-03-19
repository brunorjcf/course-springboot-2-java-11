package com.TechVF.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TechVF.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
