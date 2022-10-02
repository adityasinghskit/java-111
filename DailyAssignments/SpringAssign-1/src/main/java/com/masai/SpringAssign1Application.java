package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="Book API",version="1.0",description="Basic API to perform CRUD on books"))
public class SpringAssign1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringAssign1Application.class, args);
	}
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
	LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
	lvfb.setValidationMessageSource(ms);
	return lvfb;
	}
}
