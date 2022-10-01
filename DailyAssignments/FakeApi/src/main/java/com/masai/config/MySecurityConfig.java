package com.masai.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.masai.service.CustomUserDetailService;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private CustomUserDetailService customUserDetailService;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		 	.csrf().disable()
			.authorizeRequests()
			.antMatchers("/public/**").permitAll()
			.antMatchers("/users/**").hasRole("ADMIN")
			.antMatchers("/signin").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			//.httpBasic();
			.formLogin()
			.loginPage("/signin")
			.loginProcessingUrl("/dologin")
			.defaultSuccessUrl("/users/");
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication()
		.withUser("aditya")
		.password(this.passwordEncoder().encode("aditya"))
		.roles("NORMAL");
		auth.inMemoryAuthentication()
		.withUser("admin")
		.password(this.passwordEncoder().encode("admin"))
		.roles("ADMIN");
		*/
		auth.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder());
	}
	//ROLE- HIGH LEVEL OVERVIEW-> NORMAL:READ
	//AUTHORITY-permission:READ
	//ADMIN:read,write,update
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(4);
	}
}
