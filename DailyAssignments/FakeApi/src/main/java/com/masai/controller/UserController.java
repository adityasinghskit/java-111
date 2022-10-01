package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.User;
import com.masai.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
private UserService uService;

@GetMapping("/")
public List<User> getAllUsers(){
	return uService.getAllUsers();
}
//@PreAuthorize("hasRole('ADMIN')")
@GetMapping("/{username}")
public User getUser(@PathVariable("username") String username) {
	return uService.getUser(username);
}

@PostMapping("/")
public User addUser(@Valid @RequestBody User user) {
	return uService.addUser(user);
}
}
