package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.ProjectDAO;
import com.timetracker.vo.Project;

@Service
public class ProjectService {
	@Autowired
	private ProjectDAO dao;
	public Object getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addProjects(List<Project> departments) {
		// TODO Auto-generated method stub
		
	}

	public void updateProjects(List<Project> projects) {
		// TODO Auto-generated method stub
		
	}

}
