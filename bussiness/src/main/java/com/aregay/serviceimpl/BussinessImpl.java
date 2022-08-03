package com.aregay.serviceimpl;

import org.springframework.stereotype.Service;

import com.aregay.service.Bussiness;

@Service
public class BussinessImpl implements Bussiness {

	@Override
	public String message() {
		return "Hello Caller this message is from BussinessService Impl";
	}

}
