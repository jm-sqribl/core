package com.freeform.core.service;

import java.util.List;
import com.freeform.core.model.AbstractEntity;

public interface EntityService<T extends AbstractEntity> {
	
	public T create(T entity);
	public T delete(Long id) throws Exception;
	public List<T> findAll();
	public T update(T entity) throws Exception;
	public T findById(Long id);
	public Long count();

}
