package com.cts.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"","/","/home"})
public class WelcomeController {

	@GetMapping
	public String sayHelloAction() {
		return "HEllo! Every One";
	}
}
