package com.timetracker.controller;

import java.util.List;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.ProjectService;
import com.timetracker.service.ResourceService;
import com.timetracker.util.Response;
import com.timetracker.vo.Project;
import com.timetracker.vo.Resource;

@RestController
@RequestMapping("/resources")
public class ResourceController {
	@Autowired
	private ResourceService service;
	@RequestMapping(method = RequestMethod.GET)
	public Object getResources() {
		return service.getResources();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addResources(List<Resource> resource) {
		service.addResources(resource);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateResources(List<Resource> resources) {
		service.updateResources(resources);
	}
	// Get Resources working on a project for a particular client
	@RequestMapping(value = "/perClient/{clientId}", method = RequestMethod.GET)
	public Object getClientResources(Integer clientId) {
		return service.getClientResources(clientId);
	}
	@RequestMapping(value = "/perProject/{projectId}", method = RequestMethod.GET)
	public Object getProjectResources(Integer projectId) {
		return service.getProjectResources(projectId);
	}
	
}