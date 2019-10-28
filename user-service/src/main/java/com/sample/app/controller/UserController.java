package com.sample.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/")
	public String homePage() {
		return "User Service: Support User CRUD Operations";
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String notifications() {
		return "There are 1 million users in the database";
	}
}
