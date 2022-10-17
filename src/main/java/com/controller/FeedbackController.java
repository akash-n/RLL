package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.service.AppService;

@Controller
public class FeedbackController {
	
	@Autowired
	private AppService appService;
	
	@PutMapping("/manager")
	public String manager() {
		return "complaint";
	}
	@GetMapping("/engineer")
	public String feedback1() {
		return "engineer";
	}
	@GetMapping("/complaint")
	public String complaint() {
		return "complaint";
	}
}
