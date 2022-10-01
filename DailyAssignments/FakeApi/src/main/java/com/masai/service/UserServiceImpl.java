package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.model.User;
@Service
public class UserServiceImpl implements UserService {
	List<User> list= new ArrayList<>();
	public UserServiceImpl() {
		list.add(new User("abc","abc","abc@email.com","NORMAL"));
		list.add(new User("xyz","xyz","xyz@email.com","ADMIN"));
	}
	
	// get All existing user
	@Override
	public List<User> getAllUsers() {
		return list;
	}
	// get user by username
	@Override
	public User getUser(String username) {
		return list.stream().filter((user)-> user.getUsername().equals(username)).findAny().orElse(null);
	}
	// add new user
	@Override
	public User addUser(User user) {
		list.add(user);
		return user;
	}
	

}
