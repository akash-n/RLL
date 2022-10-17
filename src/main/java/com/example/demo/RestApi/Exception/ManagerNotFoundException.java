package com.example.demo.RestApi.Exception;

public class ManagerNotFoundException extends RuntimeException{

	public ManagerNotFoundException(int id) {
		super("Manager with id " + id + " is not Found.Pls Give another id!!");
	}
}
