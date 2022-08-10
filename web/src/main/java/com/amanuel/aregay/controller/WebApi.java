package com.amanuel.aregay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amanuel.aregay.service.SheqetService;

@RestController
public class WebApi {
	
	@Autowired
	private SheqetService bussiness;
	
	@GetMapping("/hello")
	public String message() {
		return bussiness.message();
		
	}

}

