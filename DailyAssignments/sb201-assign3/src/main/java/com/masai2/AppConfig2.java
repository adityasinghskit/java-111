package com.masai2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai2")
public class AppConfig2 {
@Bean("a")
public int getA() {
	return 4;
}
@Bean("b")
public int getB() {
	return 5;
}
}
