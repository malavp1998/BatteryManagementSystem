package com.example.dataGraph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import({ConfigClass.class})
@SpringBootApplication
public class DataGraphApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataGraphApplication.class, args);
	}

}
