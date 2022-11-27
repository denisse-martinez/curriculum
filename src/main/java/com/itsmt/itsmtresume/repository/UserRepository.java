package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itsmt.itsmtresume.models.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
