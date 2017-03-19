package com.freeform.core.respository.jpa;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
interface JpaCrudRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
