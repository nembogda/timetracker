package com.timetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.timetracker.service.ClientService;
import com.timetracker.util.Response;
import com.timetracker.vo.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	ClientService service;
	@RequestMapping(method = RequestMethod.GET)
	//TODO return custom generic Response for all services
	public @ResponseBody Object getClients() {
		return service.getClients();
	}
	@RequestMapping(method = RequestMethod.POST)
	public void addClients(@RequestBody List<Client> clients) {
		service.addClients(clients);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public void updateClients(@RequestBody List<Client> clients) {
		service.updateClients(clients);
	}
}