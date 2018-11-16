package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@Controller
@RequestMapping("project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("product", new Project());
		return "enterproject";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@ModelAttribute("project") Project project, ModelMap modelMap) {
		Project newProject = projectService.create(project);
		modelMap.put("newProject", newProject);
		return "enterproject";
	}
}