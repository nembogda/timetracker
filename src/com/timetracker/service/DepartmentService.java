package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.DepartmentDAO;
import com.timetracker.util.Response;
import com.timetracker.vo.Department;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentDAO dao;
	public void addDepartments(List<Department> departments) {
		// TODO Auto-generated method stub
	}
	public Response getDepartments() {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateDepartments(List<Department> departments) {
		// TODO Auto-generated method stub
		
	}
}
