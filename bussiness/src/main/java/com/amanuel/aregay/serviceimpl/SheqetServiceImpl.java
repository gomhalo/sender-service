package com.amanuel.aregay.serviceimpl;

import org.springframework.stereotype.Service;

import com.amanuel.aregay.service.SheqetService;

@Service
public class SheqetServiceImpl implements SheqetService {

	@Override
	public String message() {
		return "Hello Caller this message is from BussinessService Impl";
	}

}
