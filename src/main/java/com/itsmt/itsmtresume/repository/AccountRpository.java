package com.itsmt.itsmtresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itsmt.itsmtresume.models.Account;

@Repository
public interface AccountRpository extends JpaRepository<Account, Integer> {
}
