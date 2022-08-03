package com.amanuel.aregay.serviceimpl;

import org.springframework.stereotype.Service;

import com.amanuel.aregay.service.BussinessService;

@Service
public class BussinessServiceImpl implements BussinessService {

	@Override
	public String message() {
		return "Hello Caller this message is from BussinessService Impl";
	}

}
