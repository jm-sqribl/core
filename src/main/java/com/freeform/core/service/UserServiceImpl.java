package com.freeform.core.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Entity;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.freeform.core.model.AbstractEntity;
import com.freeform.core.model.Company;
import com.freeform.core.model.User;
import com.freeform.core.respository.jpa.UserRepository;

@Service("userService")
public class UserServiceImpl implements EntityService<User> {
	
	@Resource
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User create(User entity) {
		return userRepository.save(entity);
	}
	
	@Override
	@Transactional
	public User delete(Long id) throws Exception {
		User deletedEntity = userRepository.findOne(id);
		
		if (deletedEntity == null)
			throw new Exception();
		
		userRepository.delete(deletedEntity);
		return deletedEntity;
	}
	
	@Override
	@Transactional
	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		return IteratorUtils.toList(userRepository.findAll().iterator());
	}
	
	@Override
	@Transactional
	public User update(User entity) throws Exception{
		return userRepository.save(entity);
	}
	
	@Override
	@Transactional
	public User findById(Long id) {
		return userRepository.findOne(id);
	}
	
	public Long count() {
		return userRepository.count();
	}
}
