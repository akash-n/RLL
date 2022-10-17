package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.engineer;


@Repository
public interface MyRepo1 extends CrudRepository<engineer, Integer>{

}
