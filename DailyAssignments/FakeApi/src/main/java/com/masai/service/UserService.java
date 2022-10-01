package com.masai.service;

import java.util.List;

import com.masai.model.User;

public interface UserService {
	
public List<User> getAllUsers();
public User getUser(String username);
public User addUser(User user);

}
