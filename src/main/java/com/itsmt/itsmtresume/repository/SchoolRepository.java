package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itsmt.itsmtresume.models.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>{
    
}
