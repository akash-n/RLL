package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;
//http://localhost:8080/customer
import com.entity.complaint;
import com.service.*;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
//	http://localhost:8080/customer/print
	@GetMapping (value = "print")
	public String print() {
		return "<h2><center>Welcome to the Complaint Redressal System</center></h2>";
	}
	//http://localhost:8095/customer/signup
	@PostMapping(value = "signup", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signup(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
//	http://localhost:8095/customer/signIn
	@PostMapping (value = "signIn", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Customer customer) {
		return customerService.signIn(customer);
	}
	//http://localhost:8095/customer/RegisterComplaint
	@PostMapping (value = "RegisterComplaint", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addComplaint(@RequestBody complaint complaint) {
		return customerService.fileAComplaint(complaint);
	}
}
