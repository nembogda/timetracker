package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.CurrencyService;
import com.timetracker.service.DepartmentService;
import com.timetracker.util.Response;
import com.timetracker.vo.Currency;
import com.timetracker.vo.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	@RequestMapping(method = RequestMethod.GET)
	public Object getDepartment() {
		return service.getDepartments();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addDepartments(List<Department> departments) {
		service.addDepartments(departments);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateDepartments(List<Department> departments) {
		service.updateDepartments(departments);
	}
}
