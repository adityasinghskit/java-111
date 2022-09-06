package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
/*
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
*/
@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="Student API", version="1.2", description="Student Information"))
//@RequestMapping("/api")
//@EnableSwagger2
public class Springbootdatajpaapp1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdatajpaapp1Application.class, args);
	}
	/*@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2)
	    		  .select()
	    		  .apis(RequestHandlerSelectors.any())
	    		  .paths(PathSelectors.any())
	    		  .build();
	   }
	*/
	
	
}
