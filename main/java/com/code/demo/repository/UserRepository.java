package com.code.demo.repository;

import com.code.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {   
}
