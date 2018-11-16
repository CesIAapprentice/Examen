package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Projects")
public class Project {
	
	@Id
	@GeneratedValue
	@Column(name = "ProjectID")
	private Long projectID;
	
	@Basic(optional=false)
	@Column(name = "ProjectName", length = 100)
	private String projectName;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Teams", joinColumns = { @JoinColumn(name = "Project_ID" , referencedColumnName = "ProjectID")},
		inverseJoinColumns = { @JoinColumn(name = "Employee_ID", referencedColumnName = "EmployeeID") } )
	private Set<Employee> team = new HashSet<Employee>();
	

}
