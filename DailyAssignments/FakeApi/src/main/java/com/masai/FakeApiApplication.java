package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.masai.model.User;
import com.masai.repository.UserDAO;

@SpringBootApplication
public class FakeApiApplication implements CommandLineRunner {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(FakeApiApplication.class, args);
	}

	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
	LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
	lvfb.setValidationMessageSource(ms);
	return lvfb;
	}

	@Override
	public void run(String... args) throws Exception {
		User user1=new User();
		user1.setEmail("abc@email.com");
		user1.setPassword(this.bCryptPasswordEncoder.encode("abc"));
		//user1.setPassword("abc");
		user1.setUsername("abc");
		user1.setRole("ROLE_NORMAL");
		this.userDAO.save(user1);
		User user2=new User();
		user2.setEmail("xyz@email.com");
		user2.setPassword(this.bCryptPasswordEncoder.encode("xyz"));
		//user2.setPassword("xyz");
		user2.setUsername("xyz");
		user2.setRole("ROLE_ADMIN");
		this.userDAO.save(user2);
	}
}
