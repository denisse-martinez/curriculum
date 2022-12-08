package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itsmt.itsmtresume.models.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Integer>{
    
}
