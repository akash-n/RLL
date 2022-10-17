package com.example.demo.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.RestApi.Exception.EngineerNotFoundException;
import com.example.demo.RestApi.Exception.ManagerNotFoundException;
import com.example.demo.RestApi.Exception.AdminNotFoundException;
import com.example.demo.RestApi.Exception.CustomerNotFoundException;

@ControllerAdvice
public class ComplainApiException {
	
	@ExceptionHandler(value=ManagerNotFoundException.class)
	public ResponseEntity<Object> handleException(ManagerNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=AdminNotFoundException.class)
	public ResponseEntity<Object> handleException(AdminNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=EngineerNotFoundException.class)
	public ResponseEntity<Object> handleException(EngineerNotFoundException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	@ControllerAdvice
	public class CustomerExeceptionController {
		
		@ExceptionHandler(value=CustomerNotFoundException.class)
		public ResponseEntity<Object> handleException(CustomerNotFoundException ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
