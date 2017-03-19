package com.freeform.core.service;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Entity;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freeform.core.model.Company;
import com.freeform.core.model.User;
import com.freeform.core.respository.jpa.CompanyRepository;
import com.freeform.core.respository.jpa.UserRepository;

@Service("companyService")
public class CompanyServiceImpl  implements EntityService<Company> {
	
	@Resource
	private CompanyRepository repository;
	
	@Override
	@Transactional
	public Company create(Company entity) {
		return repository.save(entity);
	}
	
	@Override
	@Transactional
	public Company delete(Long id) throws Exception {
		Company deletedEntity = repository.findOne(id);
		
		if (deletedEntity == null)
			throw new Exception();
		
		repository.delete(deletedEntity);
		return deletedEntity;
	}
	
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Company> findAll() {
		return IteratorUtils.toList(repository.findAll().iterator());
	}
	
	@Override
	@Transactional
	public Company update(Company person) throws Exception{
		//Person updatedPerson = personRepository.findOne(person.getId());
		
		//if (updatedPerson == null)
		//	throw new Exception();
		
		//updatedPerson.setName(shop.getName());
		//updatedPerson.setEmplNumber(shop.getEmplNumber());
		//return updatedPerson;
		return null;
	}
	
	@Override
	@Transactional
	public Company findById(Long id) {
		return repository.findOne(id);
	}
	
	public Long count() {
		return repository.count();
	}
}