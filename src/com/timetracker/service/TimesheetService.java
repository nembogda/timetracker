package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.TimesheetDAO;
import com.timetracker.vo.Resource;
import com.timetracker.vo.Timesheet;

@Service
public class TimesheetService {
	@Autowired
	private TimesheetDAO dao;
	public Object getTimesheets() {
		return dao.getTimesheets();
	}

	public void addTimesheets(List<Timesheet> timesheets) {
		dao.addTimesheets(timesheets);	
	}

	public void updateTimesheets(List<Resource> timesheets) {
		dao.updateTimesheets(timesheets);
	}

	public Object getTimesheetsPerResource(Resource resource) {
		return dao.getTimesheetsPerResource(resource);
	}

	public Object getTimesheetsPerProject(String projectCode) {
		return dao.getTimesheetsPerProject(projectCode);
	}

	public Object getTimesheetsPerClient(Integer clientCode) {
		return dao.getTimesheetsPerClient(clientCode);
	}
}