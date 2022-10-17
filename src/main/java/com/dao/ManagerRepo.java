package com.dao;

import org.springframework.data.repository.CrudRepository;

import com.entity.ManagerDetails;

public interface ManagerRepo extends CrudRepository<ManagerDetails, Integer>{

}
