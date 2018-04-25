package com.timetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timetracker.dao.ClientDAO;
import com.timetracker.vo.Client;

@Service
public class ClientService {
	@Autowired
	private ClientDAO dao;
	public Object getClients() {
		return dao.getClients();
	}
	public void addClients(List<Client> clients) {
		dao.addClients(clients);
	}
	public void updateClients(List<Client> clients) {
		dao.updateClients(clients);
	}
}
