package com.kodebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodebook.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
	public User findByUsername(String username);

}
