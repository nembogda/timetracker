package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.DepartmentService;
import com.timetracker.service.ProjectService;
import com.timetracker.util.Response;
import com.timetracker.vo.Department;
import com.timetracker.vo.Project;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	private ProjectService service;
	@RequestMapping(method = RequestMethod.GET)
	public Object getProject() {
		return service.getProjects();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addProjects(List<Project> projects) {
		service.addProjects(projects);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateProjects(List<Project> projects) {
		service.updateProjects(projects);
	}
}