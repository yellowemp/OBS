package com.proj.obs.atm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.obs.atm.model.CustomerInfo;
import com.proj.obs.atm.service.CustomerServiceIntf;

@RestController
@RequestMapping("/api")
public class BalanceInquiryController {
	
	@Autowired
	private CustomerServiceIntf customerServiceIntf;

	
	@GetMapping("/customer")
	List<CustomerInfo> getAll() {
	    return customerServiceIntf.getAllCustomer();
	}
	
	@GetMapping("/hello")
	String hello() {
	    return "Hello";
	}

}
