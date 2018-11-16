package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;


@Service("ProjectService")
public class ProjectServiceImplement implements ProjectService{
	
	@Autowired
	private ProjectRepository projectRepository;

	@Transactional
	@Override
	public Project create(Project project) {
		return projectRepository.save(project);
	}

}
