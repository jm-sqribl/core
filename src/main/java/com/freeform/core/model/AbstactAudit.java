package com.freeform.core.model;

import java.time.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public abstract class AbstactAudit extends AbstractEntity {
	
	@Column
	protected OffsetDateTime  created;
	
	@Column
	protected OffsetDateTime  updated;
	
	@ManyToOne
	@JoinColumn(name = "createdById")
	protected User createdBy;
	
	@ManyToOne
	@JoinColumn(name = "updatedById")
	protected User updatedBy;
	
	
	public OffsetDateTime  getCreated() {
		return created;
	}
	public void setCreated(OffsetDateTime  createdDate) {
		if(createdDate != null)
			this.created = createdDate;
	}
	public OffsetDateTime  getUpdated() {
		return updated;
	}
	public void setUpdated(OffsetDateTime  updated) {
		this.updated = updated;
	}
	
	public User getCreatedBy() {
		return createdBy;
	}
	
	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}
	
	public User getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	@PrePersist
	protected void onCreate() {
	    created = OffsetDateTime .now();
	}
	
	@PreUpdate
	protected void onUpdate() {
	    updated = OffsetDateTime .now();
	}
}
