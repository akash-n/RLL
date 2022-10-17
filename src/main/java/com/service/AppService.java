package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.dao.MyRepo1;
import com.dao.MyRepo2;
import com.entity.manager;
import com.entity.engineer;
import com.entity.complaint;


@Service
public class AppService {

	@Autowired
	private MyRepo myRepo;
	
	
	
		
			   
	public boolean addmanager(manager f) {
		myRepo.save(f);
		//complaint a  =myRepo2.findById(0);
		//a.status="Assigned";
		//myRepo2.save(Manager);
		return true;
	}
	
	
	@Autowired
	private MyRepo1 myRepo1;
	public boolean addengineer( engineer f) {
		myRepo1.save(f);
		return true;
}
	@Autowired
	private MyRepo2 myRepo2;
	public boolean addcomplaint( complaint f) {
		myRepo2.save(f);
		
						
		return true;
}
	
}
