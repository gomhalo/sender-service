package com.amanuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Api {
	
	@Autowired
	private BussinessService service;
	
	@GetMapping("/hello")
	public String message() {
		
	}

}
