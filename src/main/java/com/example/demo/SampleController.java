package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to Jenkins Tutorial";
	}

}
