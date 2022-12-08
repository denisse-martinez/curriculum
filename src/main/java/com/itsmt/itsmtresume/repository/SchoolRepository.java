package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsmt.itsmtresume.models.School;

public interface SchoolRepository extends JpaRepository<School, Integer>{
    
}
