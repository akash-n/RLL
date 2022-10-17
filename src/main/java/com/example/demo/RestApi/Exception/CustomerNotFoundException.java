package com.example.demo.RestApi.Exception;


public class CustomerNotFoundException extends RuntimeException{
	
	public CustomerNotFoundException(int id) {
		super("Customer with id " + id + " is not Found.Pls Give another id!!");
	}

}