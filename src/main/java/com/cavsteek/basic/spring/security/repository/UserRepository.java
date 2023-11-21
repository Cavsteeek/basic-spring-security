package com.cavsteek.basic.spring.security.repository;

import com.cavsteek.basic.spring.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
