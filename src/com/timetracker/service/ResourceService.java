package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.ResourceDAO;
import com.timetracker.vo.Resource;

@Service
public class ResourceService {
	@Autowired ResourceDAO dao;
	public void addResources(List<Resource> resources) {
		dao.addResources(resources);
	}

	public Object getResources() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateResources(List<Resource> resources) {
		// TODO Auto-generated method stub
		
	}

	public Object getClientResources(Integer clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getProjectResources(Integer projectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
