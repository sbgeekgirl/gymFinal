package com.bootcamp.gym.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.gym.entity.User;
import com.bootcamp.gym.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository ur;
	
	@Autowired
	public UserServiceImpl(UserRepository ur) {
		this.ur = ur;
	}
	
	// GET all users
	@Override
	public List<User> getAllUsers() {
		return ur.findAll();
	}
	
	// CREATE a user
	@Override
	public User saveUser(User user) {
		return null;
	}
}
 