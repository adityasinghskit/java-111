package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Cab Booking API", version="1.2", description="Cab Booking Application is a backend focused web API, User can log in as Admin, Customer, or Driver and book a cab. Built using Java, Hibernate, Mysql, Maven, and SpringBoot."))
public class DriverCabO2OUniApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverCabO2OUniApplication.class, args);
	}
	@Bean
	public LocalValidatorFactoryBean validator(MessageSource ms) {
	LocalValidatorFactoryBean lvfb=new LocalValidatorFactoryBean();
	lvfb.setValidationMessageSource(ms);
	return lvfb;
	}
}
