package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itsmt.itsmtresume.models.SchoolExperience;

@Repository
public interface SchoolExperienceRepository extends JpaRepository<SchoolExperience, Integer>{
    
}
