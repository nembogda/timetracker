package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.ResourceService;
import com.timetracker.service.TaskService;
import com.timetracker.util.Response;
import com.timetracker.vo.Resource;
import com.timetracker.vo.Task;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskService service;
	@RequestMapping(method = RequestMethod.GET)
	public Object getTasks() {
		return service.getTasks();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addTasks(List<Task> task) {
		service.addTasks(task);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateTasks(List<Task> tasks) {
		service.updateTasks(tasks);
	}
}