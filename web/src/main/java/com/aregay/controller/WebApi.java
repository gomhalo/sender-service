package com.aregay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aregay.service.Bussiness;

@RestController
public class WebApi {
	
	@Autowired
	private Bussiness bussiness;
	
	@GetMapping("/hello")
	public String message() {
		return bussiness.message();
		
	}

}

