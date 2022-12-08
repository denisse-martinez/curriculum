package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsmt.itsmtresume.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
