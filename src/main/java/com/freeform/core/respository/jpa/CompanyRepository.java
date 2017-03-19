package com.freeform.core.respository.jpa;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.freeform.core.model.Company;

@Transactional
public interface CompanyRepository extends CrudRepository<Company, Long> {
	  
}