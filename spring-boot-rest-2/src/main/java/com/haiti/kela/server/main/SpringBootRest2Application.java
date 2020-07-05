package com.haiti.kela.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.haiti"})
public class SpringBootRest2Application extends SpringBootServletInitializer  {

	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootRest2Application.class);
	   }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest2Application.class, args);
	}

}
