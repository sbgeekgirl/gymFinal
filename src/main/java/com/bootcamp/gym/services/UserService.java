package com.bootcamp.gym.services;

import java.util.List;

import com.bootcamp.gym.entity.User;

public interface UserService {
	
	// GET all users
	public List<User> getAllUsers();
	List<User> users = 
	//CREATE a user
	public User saveUser(User user);
	
	/*
	 * public User getUserByID(int id);
	 * 
	 *
	 * 
	 * public User updateUser(User user, int id);
	 * 
	 * public void deleteUser(int id);
	 * 
	 */

}
