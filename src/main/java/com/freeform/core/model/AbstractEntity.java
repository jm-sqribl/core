package com.freeform.core.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractEntity implements VersionedEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Version
    @Column(nullable = false)
    private Integer version;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
