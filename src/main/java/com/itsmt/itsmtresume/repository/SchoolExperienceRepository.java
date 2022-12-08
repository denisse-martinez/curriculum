package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolExperienceRepository extends JpaRepository<SchoolExperienceRepository, Integer>{
    
}
