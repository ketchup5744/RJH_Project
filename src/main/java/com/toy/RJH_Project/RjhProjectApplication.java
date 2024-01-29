package com.toy.RJH_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RjhProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RjhProjectApplication.class, args);
	}

}
