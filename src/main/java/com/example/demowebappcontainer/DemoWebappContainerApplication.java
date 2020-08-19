package com.example.demowebappcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoWebappContainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoWebappContainerApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String getMessage() {
		return "Azure Webapp with container!";
	}

}
