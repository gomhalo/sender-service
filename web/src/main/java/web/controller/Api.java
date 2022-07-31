package web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@GetMapping("/hello")
	public String message() {
		return "Hello world I am from Sender API";
	}

}
