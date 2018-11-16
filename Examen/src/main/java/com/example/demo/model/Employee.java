package com.example.demo.model;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee {
	
	@Id @GeneratedValue
	@Column(name="EmployeeID")
	private Long employeeID;
	
	@Basic(optional=false)
	@Column(name="EmployeeFirstName", length=100)
	private String employeeFirstName;
	
	@Basic(optional=false)
	@Column(name="EmployeeLastName", length=100)
	private String employeeLastName;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy="team")
	private Set<Project> teamProjects;
}
