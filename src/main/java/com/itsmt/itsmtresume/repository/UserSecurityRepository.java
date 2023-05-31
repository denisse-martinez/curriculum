package com.itsmt.itsmtresume.repository;

import com.itsmt.itsmtresume.models.UserSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSecurityRepository extends JpaRepository<UserSecurity, Long> {
    UserSecurity findByUsername(String username);
}
