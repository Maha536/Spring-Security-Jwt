package com.maha.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/error")
	public String erroroccured() {
		return "Page not defined!";
	}
}
