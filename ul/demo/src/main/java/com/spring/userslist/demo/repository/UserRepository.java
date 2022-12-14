package com.spring.userslist.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.userslist.demo.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long> {  
    
}
