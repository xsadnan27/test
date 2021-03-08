package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {

	@GetMapping("/viewAll")
	public String getMyName() {
		return "Simple Spring Boot Returns";
	}

}
