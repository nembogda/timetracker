package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.ResourceService;
import com.timetracker.service.TimesheetService;
import com.timetracker.util.Response;
import com.timetracker.vo.Resource;
import com.timetracker.vo.Timesheet;

@RestController
@RequestMapping("/timesheets")
public class TimesheetController {
	@Autowired
	private TimesheetService service;
	@RequestMapping(method = RequestMethod.POST)
	public void addTimesheets(List<Timesheet> timesheets) {
		service.addTimesheets(timesheets);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateTimesheets(List<Resource> timesheets) {
		service.updateTimesheets(timesheets);
	}
	@RequestMapping(method = RequestMethod.GET)
	public Object getTimesheets() {
		return service.getTimesheets();
	}
	@RequestMapping(value= "/perResource", method = RequestMethod.GET)
	public Object getTimesheetsPerResource(@RequestBody Resource resource) {
		return service.getTimesheetsPerResource(resource);
	}
	@RequestMapping(value= "/perProject/{projectCode}", method = RequestMethod.GET)
	public Object getTimesheetsPerProject(@PathVariable(value="projectCode") String projectCode) {
		return service.getTimesheetsPerProject(projectCode);
	}
	@RequestMapping(value= "/perClient/{clientId}", method = RequestMethod.GET)
	public Object getTimesheetsPerClient(@PathVariable(value="clientId") Integer clientId) {
		return service.getTimesheetsPerClient(clientId);
	}
}