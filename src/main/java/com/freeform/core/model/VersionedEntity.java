package com.freeform.core.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public interface VersionedEntity {
	
	public Integer getVersion();
	public void setVersion(Integer version);
}
