package com.kodebook.services;

import com.kodebook.entities.User;

public interface UserService {
	public boolean isExist(String username,String email);
	public void addUser(User user);
	public boolean validateUser(String username , String password);
	

}
