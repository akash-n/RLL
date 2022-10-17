package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.manager;


@Repository
public interface MyRepo extends CrudRepository<manager, Integer>{
	

	

	

}
