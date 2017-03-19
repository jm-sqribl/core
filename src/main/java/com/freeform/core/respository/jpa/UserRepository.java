package com.freeform.core.respository.jpa;

import org.springframework.transaction.annotation.Transactional;
import com.freeform.core.model.User;

@Transactional
public interface UserRepository extends JpaCrudRepository<User, Long> {
	  
}