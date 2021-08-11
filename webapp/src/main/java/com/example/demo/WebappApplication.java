package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@ComponentScan
@SpringBootApplication
public class WebappApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WebappApplication.class);
	}


	public static void main(String[] args) {
		 SpringApplication.run(WebappApplication.class, args);
	}

}
