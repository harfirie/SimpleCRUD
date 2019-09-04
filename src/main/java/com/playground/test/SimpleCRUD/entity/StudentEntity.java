package com.playground.test.SimpleCRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {

	@Id
	@Column(name = "STUDENTID")
    Long SId;
	
	@Column(name = "STUDENT_NAME")
    String SName;

	public Long getSId() {
		return SId;
	}

	public void setSId(Long sId) {
		SId = sId;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}
}
