package com.example.demo.RestApi.Exception;

public class EngineerNotFoundException extends RuntimeException{
	
	public EngineerNotFoundException(int id) {
		super("Engineer with id " + id + " is not Found.Pls Give another id!!");
	}

}
