package com.atul.main.config;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.atul.main.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
