package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

	
	@GetMapping("hello")
	public String hello()

		return "Your time starts now...";
	}

	@GetMapping("welcome")
	public String Welcome()

		return "Welcome to the show...";
	}
}
