package com.kodebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodebook.entities.Post;
import com.kodebook.repositories.PostRepository;

@Service
public class PostServiceImple implements PostService {
	
	@Autowired
	PostRepository repo;

	@Override
	public void cratePost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
	}
	

}
