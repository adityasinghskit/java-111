package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.CustomUserDetail;
import com.masai.model.User;
import com.masai.repository.UserDAO;

@Service
public class CustomUserDetailService implements UserDetailsService {
	@Autowired
	private UserDAO userDAO;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> opt=this.userDAO.findById(username);
		if(opt.get()!=null) {
			User u=opt.get();
			return new CustomUserDetail(u);
		}else {
			throw new UsernameNotFoundException(username);
		}
	}

}
