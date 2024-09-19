package com.kodebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodebook.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	

}
