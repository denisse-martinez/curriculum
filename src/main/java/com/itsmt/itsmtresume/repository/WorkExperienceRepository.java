package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itsmt.itsmtresume.models.WorkExperience;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Integer> {
    
}
