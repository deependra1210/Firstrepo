package com.kodebook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodebook.entities.User;
import com.kodebook.repositories.UserRepository;

@Service
public class UserServiceImple implements UserService {
	@Autowired
	UserRepository userrepo;

	@Override
	public boolean isExist(String username, String email) {
		// TODO Auto-generated method stub
		User user_username=userrepo.findByUsername(username);
		User user_email=userrepo.findByEmail(email);
		if(user_username==null&&user_email==null)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userrepo.save(user);
		
	}

	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		if((userrepo.findByUsername(username)).getPassword().equals(password))
				{
			   return true;
				}
		     return false;
	}
	
	
	
	

}
