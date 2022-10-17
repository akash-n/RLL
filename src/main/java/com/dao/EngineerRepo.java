package com.dao;

import org.springframework.data.repository.CrudRepository;
import com.entity.EngineerDetails;

public interface EngineerRepo extends CrudRepository<EngineerDetails, Integer>{

}
