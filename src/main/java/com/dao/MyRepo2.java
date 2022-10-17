package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.complaint;
import com.entity.manager;


@Repository
public interface MyRepo2 extends CrudRepository<complaint, Integer>{

	

}
