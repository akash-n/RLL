package com.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.entity.Customer;
import com.entity.complaint;
import com.dao.ComplaintRepository;
import com.dao.MyRepo2;
import com.dao.*;

@Service
public class CustomerService {
	@Autowired
	static
	CustomerRepository customerrepository;
	
	@Autowired
	ComplaintRepository complaintrepository;
	public String signIn(Customer customer) {
		Optional<Customer> op = customerrepository.findById(customer.getId());
		if(op.isPresent())
		{
			Customer user=op.get();
			return "Your Login is Success";
		}
		else {
			return "Wrong Credentials, Please Try Agin or Sign Up";
		}
		
	}
	public static String addCustomer(Customer customer) {
		Optional<Customer> op=customerrepository.findById(customer.getId());
		if(op.isPresent()) {
			return "This ID Alredy Exist";
		}
		else {
			customerrepository.save(customer);
			return "Your Details Added Successfully";
		}
	}
	public static String updateCustomer(Customer customer) {
		Optional<Customer> op=customerrepository.findById(customer.getId());
		if(op.isPresent()) {
			customerrepository.update(customer);
			return "This ID Alredy Exist";
		}
		else {
		
			return "Your Details Added Successfully";
		}
	
	
	}
	public String fileAComplaint(complaint complaint) {
		Optional<complaint> op = complaintrepository.findById(complaint.getcid());
		if(op.isPresent()) {
			return "Complaint token must be unique";
		}else {
			complaintrepository.save(complaint);
			return "Complaint filed succesfully";
		}
	}
	public static String deleteCustomer(Customer customer) {
		Optional<Customer> op = customerrepository.findById(customer.getId());
		if(op.isPresent()) {
			customerrepository.delete(customer);
			return "This ID Alredy Exist";
		}
		else {
			
			return "Your Details alreadySuccessfully";
		}
	
}
}